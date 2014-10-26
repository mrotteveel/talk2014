/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
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
