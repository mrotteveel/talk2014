/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
 */
package nl.lawinegevaar.jaytalk2014.sandbox;

import nl.lawinegevaar.jaytalk2014.hibernate.employee.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class TestHibernateEmployee {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        try {
            final Query query = em.createQuery("select e from EmployeeEntity e join e.job j");
            query.getResultList().forEach(o -> {
                EmployeeEntity employee = (EmployeeEntity) o;
                System.out.println(employee.getFullName());
            });

            final Query scalarQuery = em.createNativeQuery("select avg(salary), max(salary), min(salary) from EMPLOYEE");
            System.out.println(scalarQuery.getSingleResult());
        } finally {
            em.close();
            emf.close();
        }
    }
}
