/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
 */

package nl.lawinegevaar.jaytalk2014.jpajooq;

import org.jooq.Record3;
import org.jooq.Select;
import org.junit.Test;

import javax.persistence.Query;
import java.math.BigDecimal;

import static nl.lawinegevaar.jaytalk2014.jooq.employee.Tables.EMPLOYEE;
import static org.jooq.impl.DSL.*;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class Demo_03_WindowFunctions extends AbstractCommonOperations {
    /*
     Equivalents of:

     select full_name, salary, dense_rank() over (order by salary desc) as salary_rank
     from employee
     order by salary_rank
     rows 5

     */

    @Test
    public void jooqWindowFunc() {
        withJooq(db -> {
            Select<Record3<String, BigDecimal, Integer>> salaryRank = db
                .select(EMPLOYEE.FULL_NAME, EMPLOYEE.SALARY, denseRank().over(orderBy(EMPLOYEE.SALARY.desc())).as("salary_rank"))
                .from(EMPLOYEE)
                .orderBy(inline(3))
                .limit(5);
            salaryRank
                .fetch()
                .forEach(sr -> System.out.printf("%-20s %10s %s%n",
                    sr.getValue(EMPLOYEE.FULL_NAME), sr.getValue(EMPLOYEE.SALARY), sr.value3()));
        });
    }

    @Test
    public void jpaWindowFunc_usingNativeQuery() {
        withJpa(em -> {
            Query query = em.createNativeQuery(
                "select full_name, salary, dense_rank() over (order by salary desc) as salary_rank\n" +
                    "from employee\n" +
                    "order by salary_rank\n" +
                    "rows 5");
            query.getResultList()
                .forEach(o -> {
                    Object[] result = (Object[]) o;
                    System.out.printf("%-20s %10s %s%n", result[0], result[1], result[2]);
                });
        });
    }
}
