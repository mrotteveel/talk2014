/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
 */

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

    @Test
    public void jpqQueryAll_unTyped() {
        withJpa(em -> {
            Query query = em
                .createQuery("select e from EmployeeEntity e");
            query.getResultList()
                .forEach(e -> printEmployeeEntity((EmployeeEntity) e));
        });
    }

    @Test
    public void jpaQueryAll_Typed() {
        withJpa(em -> {
            TypedQuery<EmployeeEntity> query = em
                .createQuery("select e from EmployeeEntity e", EmployeeEntity.class);
            query.getResultList()
                .forEach(this::printEmployeeEntity);
        });
    }

    @Test
    public void jooqQueryAll_TypedRecord() {
        withJooq(db -> db
                .selectFrom(EMPLOYEE)
                .fetch()
                .forEach(this::printEmployeeRecord)
        );
    }

    @Test
    public void jooqQueryAll_TypedColumns() {
        withJooq(db -> db
                .select()
                .from(EMPLOYEE)
                .fetch()
                .forEach(r -> System.out.printf("%3d %s%n",
                    r.getValue(EMPLOYEE.EMP_NO),
                    r.getValue(EMPLOYEE.FULL_NAME)))
        );
    }
}
