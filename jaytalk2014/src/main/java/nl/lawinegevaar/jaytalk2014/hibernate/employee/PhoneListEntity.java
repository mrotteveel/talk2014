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

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
@Entity
@Table(name = "PHONE_LIST", schema = "", catalog = "")
public class PhoneListEntity {
    private Short empNo;
    private String firstName;
    private String lastName;
    private String phoneExt;
    private String location;
    private String phoneNo;

    @Id
    @Column(name = "EMP_NO")
    public Short getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Short empNo) {
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
    @Column(name = "LOCATION")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "PHONE_NO")
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneListEntity that = (PhoneListEntity) o;

        if (empNo != null ? !empNo.equals(that.empNo) : that.empNo != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (phoneExt != null ? !phoneExt.equals(that.phoneExt) : that.phoneExt != null) return false;
        if (phoneNo != null ? !phoneNo.equals(that.phoneNo) : that.phoneNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo != null ? empNo.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phoneExt != null ? phoneExt.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (phoneNo != null ? phoneNo.hashCode() : 0);
        return result;
    }
}
