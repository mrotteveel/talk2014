/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
 */
package nl.lawinegevaar.jaytalk2014.hibernate.employee;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class ProjectDepartmentBudgetEntityPK implements Serializable {
    private int fiscalYear;
    private String projId;
    private String deptNo;

    @Column(name = "FISCAL_YEAR")
    @Id
    public int getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Column(name = "PROJ_ID")
    @Id
    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    @Column(name = "DEPT_NO")
    @Id
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectDepartmentBudgetEntityPK that = (ProjectDepartmentBudgetEntityPK) o;

        if (fiscalYear != that.fiscalYear) return false;
        if (deptNo != null ? !deptNo.equals(that.deptNo) : that.deptNo != null) return false;
        if (projId != null ? !projId.equals(that.projId) : that.projId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fiscalYear;
        result = 31 * result + (projId != null ? projId.hashCode() : 0);
        result = 31 * result + (deptNo != null ? deptNo.hashCode() : 0);
        return result;
    }
}
