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
public class JobEntityPK implements Serializable {
    private String jobCode;
    private short jobGrade;
    private String jobCountry;

    @Column(name = "JOB_CODE")
    @Id
    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    @Column(name = "JOB_GRADE")
    @Id
    public short getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(short jobGrade) {
        this.jobGrade = jobGrade;
    }

    @Column(name = "JOB_COUNTRY")
    @Id
    public String getJobCountry() {
        return jobCountry;
    }

    public void setJobCountry(String jobCountry) {
        this.jobCountry = jobCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobEntityPK that = (JobEntityPK) o;

        if (jobGrade != that.jobGrade) return false;
        if (jobCode != null ? !jobCode.equals(that.jobCode) : that.jobCode != null) return false;
        if (jobCountry != null ? !jobCountry.equals(that.jobCountry) : that.jobCountry != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jobCode != null ? jobCode.hashCode() : 0;
        result = 31 * result + (int) jobGrade;
        result = 31 * result + (jobCountry != null ? jobCountry.hashCode() : 0);
        return result;
    }
}
