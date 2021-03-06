/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
 */

package nl.lawinegevaar.jaytalk2014.jpajooq;

import nl.lawinegevaar.jaytalk2014.hibernate.employee.CustomerEntity;
import nl.lawinegevaar.jaytalk2014.hibernate.employee.EmployeeEntity;
import nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.Consumer;

import static org.jooq.impl.DSL.using;

/**
 *
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public abstract class AbstractCommonOperations {

    @Rule
    public TestName name = new TestName();

    private static final String JDBC_URL = "jdbc:firebirdsql://localhost/D:/data/db/fb3/employee_talk.fdb";
    private static final String USER = "SYSDBA";
    private static final String PASSWORD = "masterkey";

    @Before
    public void printTestName() {
        System.out.println("\n**** " + name.getMethodName() + " ****");
    }

    protected void printEmployeeEntity(EmployeeEntity employee) {
        System.out.printf("%3d %s%n", employee.getEmpNo(), employee.getFullName());
    }

    protected void printEmployeeRecord(EmployeeRecord employee) {
        System.out.printf("%3d %s%n", employee.getEmpNo(), employee.getFullName());
    }

    protected void printCustomerEntity(CustomerEntity customer) {
        System.out.printf("%4d %-25s %s%n", customer.getCustNo(), customer.getCustomer(), customer.getCountry().getCountry());
    }

    protected void withJpa(Consumer<EntityManager> actionWithJpa) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
        try {
            EntityManager em = emf.createEntityManager();
            try {
                actionWithJpa.accept(em);
            } finally {
                em.close();
            }
        } finally {
            emf.close();
        }
    }

    protected void withJooq(Consumer<DSLContext> actionWithJooq) {
        try {
            try (Connection connection = getConnection()) {
                DSLContext db = using(connection, SQLDialect.FIREBIRD);
                actionWithJooq.accept(db);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }
}
