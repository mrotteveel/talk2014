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
