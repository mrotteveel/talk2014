/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
 */
package nl.lawinegevaar.jaytalk2014.hibernate.employee;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
@Entity
@Table(name = "SALARY_HISTORY", schema = "", catalog = "")
@IdClass(SalaryHistoryEntityPK.class)
public class SalaryHistoryEntity {
    private short empNo;
    private Timestamp changeDate;
    private String updaterId;
    private BigDecimal oldSalary;
    private double percentChange;
    private Double newSalary;

    @Id
    @Column(name = "EMP_NO")
    public short getEmpNo() {
        return empNo;
    }

    public void setEmpNo(short empNo) {
        this.empNo = empNo;
    }

    @Id
    @Column(name = "CHANGE_DATE")
    public Timestamp getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Timestamp changeDate) {
        this.changeDate = changeDate;
    }

    @Id
    @Column(name = "UPDATER_ID")
    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    @Basic
    @Column(name = "OLD_SALARY")
    public BigDecimal getOldSalary() {
        return oldSalary;
    }

    public void setOldSalary(BigDecimal oldSalary) {
        this.oldSalary = oldSalary;
    }

    @Basic
    @Column(name = "PERCENT_CHANGE")
    public double getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }

    @Basic
    @Column(name = "NEW_SALARY", insertable = false, updatable = false)
    @Generated(GenerationTime.ALWAYS)
    public Double getNewSalary() {
        return newSalary;
    }

    public void setNewSalary(Double newSalary) {
        this.newSalary = newSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalaryHistoryEntity that = (SalaryHistoryEntity) o;

        if (empNo != that.empNo) return false;
        if (Double.compare(that.percentChange, percentChange) != 0) return false;
        if (changeDate != null ? !changeDate.equals(that.changeDate) : that.changeDate != null) return false;
        if (newSalary != null ? !newSalary.equals(that.newSalary) : that.newSalary != null) return false;
        if (oldSalary != null ? !oldSalary.equals(that.oldSalary) : that.oldSalary != null) return false;
        if (updaterId != null ? !updaterId.equals(that.updaterId) : that.updaterId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) empNo;
        result = 31 * result + (changeDate != null ? changeDate.hashCode() : 0);
        result = 31 * result + (updaterId != null ? updaterId.hashCode() : 0);
        result = 31 * result + (oldSalary != null ? oldSalary.hashCode() : 0);
        temp = Double.doubleToLongBits(percentChange);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (newSalary != null ? newSalary.hashCode() : 0);
        return result;
    }
}
