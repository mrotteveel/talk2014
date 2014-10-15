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

import javax.persistence.*;
import java.util.Collection;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
@Entity
@Table(name = "PROJECT", schema = "", catalog = "")
public class ProjectEntity {
    private String projId;
    private String projName;
    private String projDesc;
    private String product;
    private EmployeeEntity teamLeader;
    private Collection<ProjectDepartmentBudgetEntity> projectDepartmentBudgets;
    private EmployeeEntity assignedEmployees;

    @Id
    @Column(name = "PROJ_ID")
    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    @Basic
    @Column(name = "PROJ_NAME")
    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    @Basic
    @Column(name = "PROJ_DESC")
    public String getProjDesc() {
        return projDesc;
    }

    public void setProjDesc(String projDesc) {
        this.projDesc = projDesc;
    }

    @Basic
    @Column(name = "PRODUCT")
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectEntity that = (ProjectEntity) o;

        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (projDesc != null ? !projDesc.equals(that.projDesc) : that.projDesc != null) return false;
        if (projId != null ? !projId.equals(that.projId) : that.projId != null) return false;
        if (projName != null ? !projName.equals(that.projName) : that.projName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projId != null ? projId.hashCode() : 0;
        result = 31 * result + (projName != null ? projName.hashCode() : 0);
        result = 31 * result + (projDesc != null ? projDesc.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "TEAM_LEADER", referencedColumnName = "EMP_NO")
    public EmployeeEntity getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(EmployeeEntity teamLeader) {
        this.teamLeader = teamLeader;
    }

    @OneToMany(mappedBy = "project")
    public Collection<ProjectDepartmentBudgetEntity> getProjectDepartmentBudgets() {
        return projectDepartmentBudgets;
    }

    public void setProjectDepartmentBudgets(Collection<ProjectDepartmentBudgetEntity> projectDepartmentBudgets) {
        this.projectDepartmentBudgets = projectDepartmentBudgets;
    }

    @ManyToOne
    @JoinTable(name = "EMPLOYEE_PROJECT", catalog = "", schema = "", joinColumns = @JoinColumn(name = "PROJ_ID", referencedColumnName = "PROJ_ID", nullable = false), inverseJoinColumns = @JoinColumn(name = "EMP_NO", referencedColumnName = "EMP_NO", nullable = false))
    public EmployeeEntity getAssignedEmployees() {
        return assignedEmployees;
    }

    public void setAssignedEmployees(EmployeeEntity assignedEmployees) {
        this.assignedEmployees = assignedEmployees;
    }
}
