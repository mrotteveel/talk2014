package nl.lawinegevaar.jaytalk2014.jpajooq;

import org.junit.Test;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class Demo_06_Combination extends AbstractCommonOperations {

    /**
    <pre>
    withJooq(db -> {
        ProjDeptBudget pdb = PROJ_DEPT_BUDGET.as("pdb");
        Project prj = PROJECT.as("prj");
        Department dep = DEPARTMENT.as("deb");

        Select<Record5<String, String, Integer, String, Integer>> query = db
            .select(
                prj.PROJ_ID,
                prj.PROJ_NAME,
                rowNumber().over(orderBy(pdb.PROJECTED_BUDGET)).as("byBudget"),
                dep.DEPARTMENT_,
                rowNumber().over(partitionBy(pdb.PROJ_ID).orderBy(pdb.PROJECTED_BUDGET)).as("byBudgetPerProject"))
            .from(PROJ_DEPT_BUDGET.as("pdb"))
            .join(PROJECT.as("prj")).using(pdb.PROJ_ID)
            .join(DEPARTMENT.as("deb")).using(pdb.DEPT_NO)
            .where(pdb.FISCAL_YEAR.eq(inline(1995)))
            .orderBy(pdb.PROJECTED_BUDGET);

        withJpa(em -> {
            Query nativeQuery = em.createNativeQuery(query.getSQL());
            nativeQuery.getResultList().forEach(o -> {
                Object[] row = (Object[]) o;
                System.out.printf("%4s %-25s %2s %-25s %2s%n", row[0], row[1], row[2], row[3], row[4]);
            });
        });
    });
    </pre>
    */
    @Test
    public void combineJpaAndJooq() {

    }
}
