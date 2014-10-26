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
@Table(name = "JOB", schema = "", catalog = "")
@IdClass(JobEntityPK.class)
public class JobEntity {
    private String jobCode;
    private short jobGrade;
    private String jobCountry;
    private String jobTitle;
    private BigDecimal minSalary;
    private BigDecimal maxSalary;
    private String jobRequirement;
    private CountryEntity country;

    @Id
    @Column(name = "JOB_CODE")
    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    @Id
    @Column(name = "JOB_GRADE")
    public short getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(short jobGrade) {
        this.jobGrade = jobGrade;
    }

    @Id
    @Column(name = "JOB_COUNTRY")
    public String getJobCountry() {
        return jobCountry;
    }

    public void setJobCountry(String jobCountry) {
        this.jobCountry = jobCountry;
    }

    @Basic
    @Column(name = "JOB_TITLE")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Basic
    @Column(name = "MIN_SALARY")
    public BigDecimal getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(BigDecimal minSalary) {
        this.minSalary = minSalary;
    }

    @Basic
    @Column(name = "MAX_SALARY")
    public BigDecimal getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(BigDecimal maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Basic
    @Column(name = "JOB_REQUIREMENT")
    public String getJobRequirement() {
        return jobRequirement;
    }

    public void setJobRequirement(String jobRequirement) {
        this.jobRequirement = jobRequirement;
    }

    /*
    // Defined as an array
    @Basic
    @Column(name = "LANGUAGE_REQ")
    public String getLanguageReq() {
        return languageReq;
    }

    public void setLanguageReq(String languageReq) {
        this.languageReq = languageReq;
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobEntity jobEntity = (JobEntity) o;

        if (jobGrade != jobEntity.jobGrade) return false;
        if (jobCode != null ? !jobCode.equals(jobEntity.jobCode) : jobEntity.jobCode != null) return false;
        if (jobCountry != null ? !jobCountry.equals(jobEntity.jobCountry) : jobEntity.jobCountry != null) return false;
        if (jobRequirement != null ? !jobRequirement.equals(jobEntity.jobRequirement) : jobEntity.jobRequirement != null)
            return false;
        if (jobTitle != null ? !jobTitle.equals(jobEntity.jobTitle) : jobEntity.jobTitle != null) return false;
        if (maxSalary != null ? !maxSalary.equals(jobEntity.maxSalary) : jobEntity.maxSalary != null) return false;
        if (minSalary != null ? !minSalary.equals(jobEntity.minSalary) : jobEntity.minSalary != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jobCode != null ? jobCode.hashCode() : 0;
        result = 31 * result + (int) jobGrade;
        result = 31 * result + (jobCountry != null ? jobCountry.hashCode() : 0);
        result = 31 * result + (jobTitle != null ? jobTitle.hashCode() : 0);
        result = 31 * result + (minSalary != null ? minSalary.hashCode() : 0);
        result = 31 * result + (maxSalary != null ? maxSalary.hashCode() : 0);
        result = 31 * result + (jobRequirement != null ? jobRequirement.hashCode() : 0);
        return result;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JOB_COUNTRY", referencedColumnName = "COUNTRY", nullable = false, insertable = false, updatable = false)
    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }
}
