package nl.lawinegevaar.jaytalk2014;

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

    private static final String JDBC_URL = "jdbc:firebirdsql://localhost/D:/data/db/fb3/employee_talk.fdb?charSet=UTF-8";
    private static final String USER = "SYSDBA";
    private static final String PASSWORD = "masterkey";

    private static EntityManagerFactory emf;

    @BeforeClass
    public static void init() {
        emf = Persistence.createEntityManagerFactory("employee");
    }

    @AfterClass
    public static void cleanup() {
        emf.close();
    }

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

    protected void withJpa(Consumer<EntityManager> actionWithJpa) {
        EntityManager em = createEntityManager();
        try {
            actionWithJpa.accept(em);
        } finally {
            em.close();
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

    protected EntityManager createEntityManager() {
        return emf.createEntityManager();
    }

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }
}
