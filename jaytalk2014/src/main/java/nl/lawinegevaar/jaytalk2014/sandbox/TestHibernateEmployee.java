/*
 * $Id$
 * 
 * Firebird Open Source JavaEE Connector - JDBC Driver
 *
 * Distributable under LGPL license.
 * You may obtain a copy of the License at http://www.gnu.org/copyleft/lgpl.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * LGPL License for more details.
 *
 * This file was created by members of the firebird development team.
 * All individual contributions remain the Copyright (C) of those
 * individuals.  Contributors to this file are either listed here or
 * can be obtained from a source control history command.
 *
 * All rights reserved.
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
