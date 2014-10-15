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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
@Entity
@Table(name = "EMPLOYEE", schema = "", catalog = "")
public class EmployeeEntity {
    private short empNo;
    private String firstName;
    private String lastName;
    private String phoneExt;
    private Timestamp hireDate;
    private BigDecimal salary;
    private String fullName;
    private Collection<DepartmentEntity> managerOf;
    private DepartmentEntity department;
    private JobEntity job;
    private Collection<ProjectEntity> teamLeaderOf;
    private Collection<SalaryHistoryEntity> salaryHistory;
    private Collection<SalesEntity> sales;
    private Collection<ProjectEntity> projects;

    @Id
    @Column(name = "EMP_NO")
    public short getEmpNo() {
        return empNo;
    }

    public void setEmpNo(short empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "PHONE_EXT")
    public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    @Basic
    @Column(name = "HIRE_DATE")
    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    @Basic
    @Column(name = "SALARY")
    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "FULL_NAME", updatable = false, insertable = false)
    @Generated(GenerationTime.ALWAYS)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (empNo != that.empNo) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (hireDate != null ? !hireDate.equals(that.hireDate) : that.hireDate != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (phoneExt != null ? !phoneExt.equals(that.phoneExt) : that.phoneExt != null) return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) empNo;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phoneExt != null ? phoneExt.hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "manager")
    public Collection<DepartmentEntity> getManagerOf() {
        return managerOf;
    }

    public void setManagerOf(Collection<DepartmentEntity> managerOf) {
        this.managerOf = managerOf;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPT_NO", referencedColumnName = "DEPT_NO", nullable = false)
    public DepartmentEntity getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEntity department) {
        this.department = department;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "JOB_CODE", referencedColumnName = "JOB_CODE", nullable = false),
            @JoinColumn(name = "JOB_GRADE", referencedColumnName = "JOB_GRADE", nullable = false),
            @JoinColumn(name = "JOB_COUNTRY", referencedColumnName = "JOB_COUNTRY", nullable = false)
    })
    public JobEntity getJob() {
        return job;
    }

    public void setJob(JobEntity job) {
        this.job = job;
    }

    @OneToMany(mappedBy = "teamLeader")
    public Collection<ProjectEntity> getTeamLeaderOf() {
        return teamLeaderOf;
    }

    public void setTeamLeaderOf(Collection<ProjectEntity> teamLeaderOf) {
        this.teamLeaderOf = teamLeaderOf;
    }

    @OneToMany
    @JoinColumn(name="EMP_NO")
    public Collection<SalaryHistoryEntity> getSalaryHistory() {
        return salaryHistory;
    }

    public void setSalaryHistory(Collection<SalaryHistoryEntity> salaryHistory) {
        this.salaryHistory = salaryHistory;
    }

    @OneToMany(mappedBy = "salesRepresentative")
    public Collection<SalesEntity> getSales() {
        return sales;
    }

    public void setSales(Collection<SalesEntity> sales) {
        this.sales = sales;
    }

    @OneToMany(mappedBy = "assignedEmployees")
    public Collection<ProjectEntity> getProjects() {
        return projects;
    }

    public void setProjects(Collection<ProjectEntity> projects) {
        this.projects = projects;
    }
}
