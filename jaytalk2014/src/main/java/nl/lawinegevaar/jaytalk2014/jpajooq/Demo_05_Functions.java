/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
 */

package nl.lawinegevaar.jaytalk2014.jpajooq;

import nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Department;
import org.jooq.Record3;
import org.jooq.Select;
import org.junit.Test;

import javax.persistence.Query;

import static nl.lawinegevaar.jaytalk2014.jooq.employee.Tables.DEPARTMENT;
import static org.jooq.impl.DSL.substring;
import static org.jooq.impl.DSL.upper;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class Demo_05_Functions extends AbstractCommonOperations {

    @Test
    public void jpaStringManipulation() {
        withJpa(em -> {
            Query query = em.createQuery(
                "select d.deptNo, substring(d.department, 1, 5), upper(d.location) from DepartmentEntity d");

            query.getResultList().forEach(o -> {
                Object[] row = (Object[]) o;
                System.out.printf("%s %-5s %s%n", row[0], row[1], row[2]);
            });
        });
    }

    @Test
    public void jooqStringManipulation() {
        withJooq(db -> {
            Department d = DEPARTMENT.as("d");

            Select<Record3<String, String, String>> query = db
                .select(d.DEPT_NO, substring(d.DEPARTMENT_, 1, 5), upper(d.LOCATION))
                .from(DEPARTMENT.as("d"));

            query.fetch().forEach(r -> System.out.printf("%s %-5s %s%n", r.value1(), r.value2(), r.value3()));
        });
    }
}
