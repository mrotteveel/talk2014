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
@Table(name = "CUSTOMER", schema = "", catalog = "")
public class CustomerEntity {
    private int custNo;
    private String customer;
    private String contactFirst;
    private String contactLast;
    private String phoneNo;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String stateProvince;
    private String postalCode;
    private String onHold;
    private CountryEntity country;
    private Collection<SalesEntity> sales;

    @Id
    @Column(name = "CUST_NO")
    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    @Basic
    @Column(name = "CUSTOMER")
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Basic
    @Column(name = "CONTACT_FIRST")
    public String getContactFirst() {
        return contactFirst;
    }

    public void setContactFirst(String contactFirst) {
        this.contactFirst = contactFirst;
    }

    @Basic
    @Column(name = "CONTACT_LAST")
    public String getContactLast() {
        return contactLast;
    }

    public void setContactLast(String contactLast) {
        this.contactLast = contactLast;
    }

    @Basic
    @Column(name = "PHONE_NO")
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "ADDRESS_LINE1")
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Basic
    @Column(name = "ADDRESS_LINE2")
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "STATE_PROVINCE")
    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    @Basic
    @Column(name = "POSTAL_CODE")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "ON_HOLD")
    public String getOnHold() {
        return onHold;
    }

    public void setOnHold(String onHold) {
        this.onHold = onHold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (custNo != that.custNo) return false;
        if (addressLine1 != null ? !addressLine1.equals(that.addressLine1) : that.addressLine1 != null) return false;
        if (addressLine2 != null ? !addressLine2.equals(that.addressLine2) : that.addressLine2 != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (contactFirst != null ? !contactFirst.equals(that.contactFirst) : that.contactFirst != null) return false;
        if (contactLast != null ? !contactLast.equals(that.contactLast) : that.contactLast != null) return false;
        if (customer != null ? !customer.equals(that.customer) : that.customer != null) return false;
        if (onHold != null ? !onHold.equals(that.onHold) : that.onHold != null) return false;
        if (phoneNo != null ? !phoneNo.equals(that.phoneNo) : that.phoneNo != null) return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (stateProvince != null ? !stateProvince.equals(that.stateProvince) : that.stateProvince != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = custNo;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (contactFirst != null ? contactFirst.hashCode() : 0);
        result = 31 * result + (contactLast != null ? contactLast.hashCode() : 0);
        result = 31 * result + (phoneNo != null ? phoneNo.hashCode() : 0);
        result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
        result = 31 * result + (addressLine2 != null ? addressLine2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (stateProvince != null ? stateProvince.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (onHold != null ? onHold.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "COUNTRY", referencedColumnName = "COUNTRY")
    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    @OneToMany(mappedBy = "customer")
    public Collection<SalesEntity> getSales() {
        return sales;
    }

    public void setSales(Collection<SalesEntity> sales) {
        this.sales = sales;
    }
}
