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

import org.jooq.DSLContext;
import org.jooq.SQLDialect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static nl.lawinegevaar.jaytalk2014.jooq.employee.Tables.EMPLOYEE;
import static org.jooq.impl.DSL.using;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class TestJooqEmployee {

    private static final String JDBC_URL = "jdbc:firebirdsql://localhost/D:/data/db/fb3/employee_talk.fdb?charSet=UTF-8";
    private static final String USER = "SYSDBA";
    private static final String PASSWORD = "masterkey";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            DSLContext db = using(connection, SQLDialect.FIREBIRD);

            db.selectFrom(EMPLOYEE)
                    .where(EMPLOYEE.LAST_NAME.eq("Williams"))
                    .fetch()
                    .stream()
                    .forEach(e -> System.out.println(e.getFullName()));
        }
    }
}
