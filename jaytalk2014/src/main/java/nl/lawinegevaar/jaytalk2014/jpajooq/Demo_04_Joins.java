/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
 */

package nl.lawinegevaar.jaytalk2014.jpajooq;

import nl.lawinegevaar.jaytalk2014.hibernate.employee.CustomerEntity;
import nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Country;
import nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer;
import org.jooq.Record3;
import org.jooq.Select;
import org.junit.Test;

import javax.persistence.TypedQuery;

import static nl.lawinegevaar.jaytalk2014.jooq.employee.Tables.COUNTRY;
import static nl.lawinegevaar.jaytalk2014.jooq.employee.Tables.CUSTOMER;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class Demo_04_Joins extends AbstractCommonOperations {

    @Test
    public void jpaImplicitJoin() {
        withJpa(em -> {
            TypedQuery<CustomerEntity> query = em.createQuery(
                "select c from CustomerEntity c where c.country.currency = 'Euro'",
                CustomerEntity.class);
            query.getResultList()
                .forEach(this::printCustomerEntity);
        });
    }

    @Test
    public void jpaExplicitJoin() {
        withJpa(em -> {
            TypedQuery<CustomerEntity> query = em.createQuery(
                "select c from CustomerEntity c join c.country k where k.currency = 'Euro'",
                CustomerEntity.class);
            query.getResultList()
                .forEach(this::printCustomerEntity);
        });
    }

    @Test
    public void jooqJoinOn() {
        withJooq(db -> {
            Customer c = CUSTOMER.as("c");
            Country k = COUNTRY.as("k");

            Select<Record3<Integer, String, String>> query = db
                .select(c.CUST_NO, c.CUSTOMER_, c.COUNTRY)
                .from(CUSTOMER.as("c"))
                .join(COUNTRY.as("k")).on(c.COUNTRY.eq(k.COUNTRY_))
                .where(k.CURRENCY.eq("Euro"));

            query.fetch().forEach(r ->
                System.out.printf("%4s %-25s %s%n",
                    r.getValue(c.CUST_NO), r.getValue(c.CUSTOMER_), r.getValue(c.COUNTRY)));
        });
    }

    @Test
    public void jooqJoinUsing() {
        withJooq(db -> {
            Customer c = CUSTOMER.as("c");
            Country k = COUNTRY.as("k");

            Select<Record3<Integer, String, String>> query = db
                .select(c.CUST_NO, c.CUSTOMER_, c.COUNTRY)
                .from(CUSTOMER.as("c"))
                .join(COUNTRY.as("k")).using(c.COUNTRY)
                .where(k.CURRENCY.eq("Euro"));

            query.fetch().forEach(r ->
                System.out.printf("%4s %-25s %s%n",
                    r.getValue(c.CUST_NO), r.getValue(c.CUSTOMER_), r.getValue(c.COUNTRY)));
        });
    }
}
