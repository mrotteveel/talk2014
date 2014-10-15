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

import nl.lawinegevaar.jaytalk2014.jooq.studychoice.tables.EducationLocation;
import org.jooq.*;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.jooq.impl.DSL.*;
import static nl.lawinegevaar.jaytalk2014.jooq.studychoice.Tables.*;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class TestJooqStudyChoice {

    private static final String JDBC_URL = "jdbc:firebirdsql://localhost/D:/data/db/fb3/FB3STUDYCHOICE.FDB?charSet=UTF-8";
    private static final String USER = "SYSDBA";
    private static final String PASSWORD = "masterkey";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            DSLContext db = using(connection, SQLDialect.FIREBIRD);
            db.selectFrom(EDUCATION)
                    .fetch()
                    .stream()
                    .forEach(r -> System.out.println(r.getStudyenglish()));

            ResultQuery<Record2<Integer, Integer>> query = db.select(EDUCATION_LOCATION.ISAT, count())
                    .from(EDUCATION_LOCATION)
                    .groupBy(EDUCATION_LOCATION.ISAT)
                    .having(count().gt(1));

            System.out.println(query.getSQL());
            query.fetch()
                    .stream()
                    .forEach(r -> System.out.printf("%d: %d%n", r.value1(), r.value2()));

            EducationLocation el = EDUCATION_LOCATION.as("el");

            final ResultQuery<Record6<String, Short, Integer, Double, Integer, BigDecimal>> query2 =
                    db.select(
                            el.BRIN,
                            el.BRINSERIALNO,
                            el.ISAT,
                            el.GENERALOPINION_01,
                            rank().over()
                                    .partitionBy(el.ISAT)
                                    .orderBy(el.GENERALOPINION_01).as("scoreRank"),
                            avg(el.GENERALOPINION_01).over()
                                    .partitionBy(el.ISAT).as("avgGeneralOpinion")
                    )
                    .from(EDUCATION_LOCATION.as("el"))
                    .orderBy(el.ISAT);

            System.out.println(query2.getSQL());
            query2.fetch()
                    .stream()
                    .forEach(r -> System.out.println(r.toString()));
            System.out.println(query2.fetch().toString());
        }
    }
}
