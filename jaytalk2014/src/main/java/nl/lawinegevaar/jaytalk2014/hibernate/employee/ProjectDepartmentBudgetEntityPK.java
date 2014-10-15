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
