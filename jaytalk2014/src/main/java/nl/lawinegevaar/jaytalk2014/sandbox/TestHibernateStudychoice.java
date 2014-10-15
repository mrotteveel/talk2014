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

import nl.lawinegevaar.jaytalk2014.hibernate.studychoice.CityEntity;
import nl.lawinegevaar.jaytalk2014.hibernate.studychoice.EducationEntity;
import nl.lawinegevaar.jaytalk2014.hibernate.studychoice.EducationLocationEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class TestHibernateStudychoice {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("studychoice");

    public static void main(String[] args) throws Exception {
        EntityManager em = emf.createEntityManager();
        try {
            final Query query = em.createQuery("from CityEntity");
            query.getResultList().forEach(o -> {
                CityEntity city = (CityEntity) o;
                System.out.printf("%s%n", city.getCity());
            });

            final EducationLocationEntity educationLocationEntity = em.find(EducationLocationEntity.class, 35L);
            System.out.println(educationLocationEntity.getEducation().getStudyEnglish());
            System.out.println(educationLocationEntity.getEducationInstitution().getInstitution().getInstitutionEnglish());
            System.out.println(educationLocationEntity.getEducation().getIsat());

            final EducationEntity educationEntity = em.find(EducationEntity.class, 34268);
            System.out.println(educationEntity.getDescription());
            System.out.println(educationEntity.getDescriptionEnglish());
            educationEntity.getEducationLocations().forEach(e -> System.out.println(e.getTitle1()));
        } finally {
            em.close();
            emf.close();
        }
    }
}
