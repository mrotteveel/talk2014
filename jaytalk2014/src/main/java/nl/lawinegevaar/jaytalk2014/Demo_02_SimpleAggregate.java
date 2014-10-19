package nl.lawinegevaar.jaytalk2014;

import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.Select;
import org.jooq.SelectJoinStep;
import org.junit.Ignore;
import org.junit.Test;

import javax.persistence.Query;

import java.math.BigDecimal;
import java.util.List;

import static nl.lawinegevaar.jaytalk2014.jooq.employee.Tables.*;
import static org.jooq.impl.DSL.*;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class Demo_02_SimpleAggregate extends AbstractCommonOperations {
    /*
        Equivalents of

        select "SALES"."CUST_NO", sum("SALES"."TOTAL_VALUE")
        from "SALES"
        group by "SALES"."CUST_NO"
     */

    /**
     <pre>
    withJpa(em -> {
        Query query = em.createQuery(
            "select s.customer.custNo, sum(totalValue) as totalvalue " +
                "from SalesEntity s " +
                "group by s.customer.custNo");
        List resultList = query.getResultList();
        resultList.forEach(o -> {
            Object[] values = (Object[]) o;
            System.out.printf("%4s, total: %10s%n", values[0], values[1]);
        });
    });
     </pre>
    */
    @Test
    public void jpaQuerySum() {

    }

    /**
     <pre>
     withJooq(db -> {
        Select<Record2<Integer, BigDecimal>> query =
            db
                .select(SALES.CUST_NO, sum(SALES.TOTAL_VALUE))
                .from(SALES)
                .groupBy(SALES.CUST_NO);

        Result<Record2<Integer, BigDecimal>> result = query.fetch();
        result.forEach(o ->
                System.out.printf("%4s, total %10s%n", o.getValue(SALES.CUST_NO), o.value2())
        );
    });
     </pre>
     */
    @Test
    public void jooqQuerySum() {

    }

    @Test
    @Ignore
    public void jpaQuerySum_brokenInFirebird() {
        // Doesn't work
        withJpa(em -> {
            Query query = em.createQuery(
                "select s.customer, sum(s.totalValue) as TotalPerCustomer " +
                    "from SalesEntity s " +
                    "group by s.customer");
            for (Object o : query.getResultList()) {
                System.out.println(o);
            }
        });
    }
}
