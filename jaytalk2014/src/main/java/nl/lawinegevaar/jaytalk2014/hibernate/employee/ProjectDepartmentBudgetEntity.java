/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
 */
package nl.lawinegevaar.jaytalk2014.hibernate.employee;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
@Entity
@Table(name = "PROJ_DEPT_BUDGET", schema = "", catalog = "")
@IdClass(ProjectDepartmentBudgetEntityPK.class)
public class ProjectDepartmentBudgetEntity {
    private int fiscalYear;
    private String projId;
    private String deptNo;
    private Integer quartHeadCnt;
    private BigDecimal projectedBudget;
    private DepartmentEntity department;
    private ProjectEntity project;

    @Id
    @Column(name = "FISCAL_YEAR")
    public int getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Id
    @Column(name = "PROJ_ID")
    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    @Id
    @Column(name = "DEPT_NO")
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    /*
    // Defined as an array
    @Basic
    @Column(name = "QUART_HEAD_CNT")
    public Integer getQuartHeadCnt() {
        return quartHeadCnt;
    }

    public void setQuartHeadCnt(Integer quartHeadCnt) {
        this.quartHeadCnt = quartHeadCnt;
    }
    */

    @Basic
    @Column(name = "PROJECTED_BUDGET")
    public BigDecimal getProjectedBudget() {
        return projectedBudget;
    }

    public void setProjectedBudget(BigDecimal projectedBudget) {
        this.projectedBudget = projectedBudget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectDepartmentBudgetEntity that = (ProjectDepartmentBudgetEntity) o;

        if (fiscalYear != that.fiscalYear) return false;
        if (deptNo != null ? !deptNo.equals(that.deptNo) : that.deptNo != null) return false;
        if (projId != null ? !projId.equals(that.projId) : that.projId != null) return false;
        if (projectedBudget != null ? !projectedBudget.equals(that.projectedBudget) : that.projectedBudget != null)
            return false;
        if (quartHeadCnt != null ? !quartHeadCnt.equals(that.quartHeadCnt) : that.quartHeadCnt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fiscalYear;
        result = 31 * result + (projId != null ? projId.hashCode() : 0);
        result = 31 * result + (deptNo != null ? deptNo.hashCode() : 0);
        result = 31 * result + (quartHeadCnt != null ? quartHeadCnt.hashCode() : 0);
        result = 31 * result + (projectedBudget != null ? projectedBudget.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DEPT_NO", referencedColumnName = "DEPT_NO", nullable = false, insertable = false, updatable = false)
    public DepartmentEntity getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEntity department) {
        this.department = department;
    }

    @ManyToOne
    @JoinColumn(name = "PROJ_ID", referencedColumnName = "PROJ_ID", nullable = false, insertable = false, updatable = false)
    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }
}
