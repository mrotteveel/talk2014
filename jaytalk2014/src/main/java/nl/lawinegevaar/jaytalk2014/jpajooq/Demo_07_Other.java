package nl.lawinegevaar.jaytalk2014.jpajooq;

import nl.lawinegevaar.jaytalk2014.hibernate.employee.JobEntity;
import nl.lawinegevaar.jaytalk2014.hibernate.employee.SalesEntity;
import nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord;
import org.jooq.Param;
import org.jooq.Select;
import org.jooq.SelectConditionStep;
import org.jooq.conf.ParamType;
import org.junit.Test;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.SingularAttribute;

import static nl.lawinegevaar.jaytalk2014.jooq.employee.Tables.*;
import static org.jooq.impl.DSL.*;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class Demo_07_Other extends AbstractCommonOperations {

    @Test
    public void jpaCriteriaAPI() {
        withJpa(em -> {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<JobEntity> cq = cb.createQuery(JobEntity.class);

            Root<JobEntity> job = cq.from(JobEntity.class);

            cq.select(job);

            // Advisable to create/generate static metamodel
            EntityType<JobEntity> model = job.getModel();
            SingularAttribute<? super JobEntity, ?> jobTitleAttr = model.getSingularAttribute("jobTitle");
            cq.where(cb.equal(job.get(jobTitleAttr), "Engineer"));

            em.createQuery(cq).getResultList()
                .forEach(j -> System.out.printf("%-5s %2d %s%n",
                    j.getJobCode(), j.getJobGrade(), j.getJobRequirement()));
        });
    }

    @Test
    public void jpaUsingParameters() {
        withJpa(em -> {
            TypedQuery<SalesEntity> query = em.createQuery(
                "select s from SalesEntity s where s.orderStatus = :orderStatus", SalesEntity.class);
            query.setParameter("orderStatus", "open");

            query.getResultList()
                .forEach(s -> System.out.printf("%s %s %s%n", s.getOrderDate(), s.getPoNumber(), s.getPaid()));
        });
    }

    @Test
    public void jooqUsingParameters() {
        withJooq(db -> {
            Param<String> param1 = param("param1", "dummy");
            Select<SalesRecord> query = db
                .selectFrom(SALES)
                .where(SALES.ORDER_STATUS.eq(param1));

            //Param<String> param1 = (Param<String>) query.getParam("param1");
            param1.setValue("open");
            query.fetch().forEach(s -> System.out.printf("%s %s %s%n", s.getOrderDate(), s.getPoNumber(), s.getPaid()));
        });
    }
}
