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
@Table(name = "SALES", schema = "", catalog = "")
public class SalesEntity {
    private String poNumber;
    private String orderStatus;
    private Timestamp orderDate;
    private Timestamp shipDate;
    private Timestamp dateNeeded;
    private String paid;
    private int qtyOrdered;
    private BigDecimal totalValue;
    private double discount;
    private String itemType;
    private BigDecimal aged;
    private CustomerEntity customer;
    private EmployeeEntity salesRepresentative;

    @Id
    @Column(name = "PO_NUMBER")
    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    @Basic
    @Column(name = "ORDER_STATUS")
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "ORDER_DATE")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "SHIP_DATE")
    public Timestamp getShipDate() {
        return shipDate;
    }

    public void setShipDate(Timestamp shipDate) {
        this.shipDate = shipDate;
    }

    @Basic
    @Column(name = "DATE_NEEDED")
    public Timestamp getDateNeeded() {
        return dateNeeded;
    }

    public void setDateNeeded(Timestamp dateNeeded) {
        this.dateNeeded = dateNeeded;
    }

    @Basic
    @Column(name = "PAID")
    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    @Basic
    @Column(name = "QTY_ORDERED")
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    @Basic
    @Column(name = "TOTAL_VALUE")
    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    @Basic
    @Column(name = "DISCOUNT")
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "ITEM_TYPE")
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "AGED", insertable = false, updatable = false)
    @Generated(GenerationTime.ALWAYS)
    public BigDecimal getAged() {
        return aged;
    }

    public void setAged(BigDecimal aged) {
        this.aged = aged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesEntity that = (SalesEntity) o;

        if (Double.compare(that.discount, discount) != 0) return false;
        if (qtyOrdered != that.qtyOrdered) return false;
        if (aged != null ? !aged.equals(that.aged) : that.aged != null) return false;
        if (dateNeeded != null ? !dateNeeded.equals(that.dateNeeded) : that.dateNeeded != null) return false;
        if (itemType != null ? !itemType.equals(that.itemType) : that.itemType != null) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (paid != null ? !paid.equals(that.paid) : that.paid != null) return false;
        if (poNumber != null ? !poNumber.equals(that.poNumber) : that.poNumber != null) return false;
        if (shipDate != null ? !shipDate.equals(that.shipDate) : that.shipDate != null) return false;
        if (totalValue != null ? !totalValue.equals(that.totalValue) : that.totalValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = poNumber != null ? poNumber.hashCode() : 0;
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (shipDate != null ? shipDate.hashCode() : 0);
        result = 31 * result + (dateNeeded != null ? dateNeeded.hashCode() : 0);
        result = 31 * result + (paid != null ? paid.hashCode() : 0);
        result = 31 * result + qtyOrdered;
        result = 31 * result + (totalValue != null ? totalValue.hashCode() : 0);
        temp = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (itemType != null ? itemType.hashCode() : 0);
        result = 31 * result + (aged != null ? aged.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CUST_NO", referencedColumnName = "CUST_NO", nullable = false)
    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    @ManyToOne
    @JoinColumn(name = "SALES_REP", referencedColumnName = "EMP_NO")
    public EmployeeEntity getSalesRepresentative() {
        return salesRepresentative;
    }

    public void setSalesRepresentative(EmployeeEntity salesRepresentative) {
        this.salesRepresentative = salesRepresentative;
    }
}
