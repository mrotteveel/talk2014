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
import java.sql.Timestamp;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class SalaryHistoryEntityPK implements Serializable {
    private short empNo;
    private Timestamp changeDate;
    private String updaterId;

    @Column(name = "EMP_NO")
    @Id
    public short getEmpNo() {
        return empNo;
    }

    public void setEmpNo(short empNo) {
        this.empNo = empNo;
    }

    @Column(name = "CHANGE_DATE")
    @Id
    public Timestamp getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Timestamp changeDate) {
        this.changeDate = changeDate;
    }

    @Column(name = "UPDATER_ID")
    @Id
    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalaryHistoryEntityPK that = (SalaryHistoryEntityPK) o;

        if (empNo != that.empNo) return false;
        if (changeDate != null ? !changeDate.equals(that.changeDate) : that.changeDate != null) return false;
        if (updaterId != null ? !updaterId.equals(that.updaterId) : that.updaterId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) empNo;
        result = 31 * result + (changeDate != null ? changeDate.hashCode() : 0);
        result = 31 * result + (updaterId != null ? updaterId.hashCode() : 0);
        return result;
    }
}
