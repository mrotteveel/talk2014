package nl.lawinegevaar.jaytalk2014.jpajooq;

import nl.lawinegevaar.jaytalk2014.hibernate.employee.EmployeeEntity;
import org.junit.Test;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import static nl.lawinegevaar.jaytalk2014.jooq.employee.Tables.EMPLOYEE;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class Demo_01_QueryAll extends AbstractCommonOperations {

    /*
        Equivalents of

        select *
        from "EMPLOYEE"
     */


    /**
    <pre>
    withJpa(em -> {
        Query query = em
            .createQuery("select e from EmployeeEntity e");
        query.getResultList()
            .forEach(e -> printEmployeeEntity((EmployeeEntity) e));
    });
     </pre>
     */
    @Test
    public void jpqQueryAll_unTyped() {

    }

    /**
    <pre>
    withJpa(em -> {
        TypedQuery<EmployeeEntity> query = em
            .createQuery("select e from EmployeeEntity e", EmployeeEntity.class);
        query.getResultList()
            .forEach(this::printEmployeeEntity);
    });
    </pre>
     */
    @Test
    public void jpaQueryAll_Typed() {

    }

    /**
    <pre>
    withJooq(db -> db
        .selectFrom(EMPLOYEE)
        .fetch()
    .forEach(this::printEmployeeRecord)
    );
     </pre>
     */
    @Test
    public void jooqQueryAll_TypedRecord() {

    }

    /**
    <pre>
    withJooq(db -> db
        .select()
        .from(EMPLOYEE)
    .fetch()
    .forEach(r -> System.out.printf("%3d %s%n",
        r.getValue(EMPLOYEE.EMP_NO),
        r.getValue(EMPLOYEE.FULL_NAME)))
    );
     </pre>
     */
    @Test
    public void jooqQueryAll_TypedColumns() {

    }
}
