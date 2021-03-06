/**
 * This class is generated by jOOQ
 */
package nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SalesRecord extends org.jooq.impl.UpdatableRecordImpl<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord> implements org.jooq.Record13<java.lang.String, java.lang.Integer, java.lang.Short, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.lang.Float, java.lang.String, java.math.BigDecimal> {

	private static final long serialVersionUID = 989309031;

	/**
	 * Setter for <code>SALES.PO_NUMBER</code>.
	 */
	public void setPoNumber(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>SALES.PO_NUMBER</code>.
	 */
	public java.lang.String getPoNumber() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>SALES.CUST_NO</code>.
	 */
	public void setCustNo(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>SALES.CUST_NO</code>.
	 */
	public java.lang.Integer getCustNo() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>SALES.SALES_REP</code>.
	 */
	public void setSalesRep(java.lang.Short value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>SALES.SALES_REP</code>.
	 */
	public java.lang.Short getSalesRep() {
		return (java.lang.Short) getValue(2);
	}

	/**
	 * Setter for <code>SALES.ORDER_STATUS</code>.
	 */
	public void setOrderStatus(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>SALES.ORDER_STATUS</code>.
	 */
	public java.lang.String getOrderStatus() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>SALES.ORDER_DATE</code>.
	 */
	public void setOrderDate(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>SALES.ORDER_DATE</code>.
	 */
	public java.sql.Timestamp getOrderDate() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>SALES.SHIP_DATE</code>.
	 */
	public void setShipDate(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>SALES.SHIP_DATE</code>.
	 */
	public java.sql.Timestamp getShipDate() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>SALES.DATE_NEEDED</code>.
	 */
	public void setDateNeeded(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>SALES.DATE_NEEDED</code>.
	 */
	public java.sql.Timestamp getDateNeeded() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>SALES.PAID</code>.
	 */
	public void setPaid(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>SALES.PAID</code>.
	 */
	public java.lang.String getPaid() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>SALES.QTY_ORDERED</code>.
	 */
	public void setQtyOrdered(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>SALES.QTY_ORDERED</code>.
	 */
	public java.lang.Integer getQtyOrdered() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>SALES.TOTAL_VALUE</code>.
	 */
	public void setTotalValue(java.math.BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>SALES.TOTAL_VALUE</code>.
	 */
	public java.math.BigDecimal getTotalValue() {
		return (java.math.BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>SALES.DISCOUNT</code>.
	 */
	public void setDiscount(java.lang.Float value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>SALES.DISCOUNT</code>.
	 */
	public java.lang.Float getDiscount() {
		return (java.lang.Float) getValue(10);
	}

	/**
	 * Setter for <code>SALES.ITEM_TYPE</code>.
	 */
	public void setItemType(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>SALES.ITEM_TYPE</code>.
	 */
	public java.lang.String getItemType() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>SALES.AGED</code>.
	 */
	public void setAged(java.math.BigDecimal value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>SALES.AGED</code>.
	 */
	public java.math.BigDecimal getAged() {
		return (java.math.BigDecimal) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.String, java.lang.Integer, java.lang.Short, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.lang.Float, java.lang.String, java.math.BigDecimal> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.String, java.lang.Integer, java.lang.Short, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.lang.Float, java.lang.String, java.math.BigDecimal> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.PO_NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.CUST_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field3() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.SALES_REP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.ORDER_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.ORDER_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.SHIP_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.DATE_NEEDED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.PAID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.QTY_ORDERED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field10() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.TOTAL_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Float> field11() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.DISCOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.ITEM_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field13() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES.AGED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getPoNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getCustNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value3() {
		return getSalesRep();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getOrderStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getOrderDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getShipDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getDateNeeded();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getPaid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getQtyOrdered();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value10() {
		return getTotalValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Float value11() {
		return getDiscount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getItemType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value13() {
		return getAged();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value1(java.lang.String value) {
		setPoNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value2(java.lang.Integer value) {
		setCustNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value3(java.lang.Short value) {
		setSalesRep(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value4(java.lang.String value) {
		setOrderStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value5(java.sql.Timestamp value) {
		setOrderDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value6(java.sql.Timestamp value) {
		setShipDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value7(java.sql.Timestamp value) {
		setDateNeeded(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value8(java.lang.String value) {
		setPaid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value9(java.lang.Integer value) {
		setQtyOrdered(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value10(java.math.BigDecimal value) {
		setTotalValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value11(java.lang.Float value) {
		setDiscount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value12(java.lang.String value) {
		setItemType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord value13(java.math.BigDecimal value) {
		setAged(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesRecord values(java.lang.String value1, java.lang.Integer value2, java.lang.Short value3, java.lang.String value4, java.sql.Timestamp value5, java.sql.Timestamp value6, java.sql.Timestamp value7, java.lang.String value8, java.lang.Integer value9, java.math.BigDecimal value10, java.lang.Float value11, java.lang.String value12, java.math.BigDecimal value13) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SalesRecord
	 */
	public SalesRecord() {
		super(nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES);
	}

	/**
	 * Create a detached, initialised SalesRecord
	 */
	public SalesRecord(java.lang.String poNumber, java.lang.Integer custNo, java.lang.Short salesRep, java.lang.String orderStatus, java.sql.Timestamp orderDate, java.sql.Timestamp shipDate, java.sql.Timestamp dateNeeded, java.lang.String paid, java.lang.Integer qtyOrdered, java.math.BigDecimal totalValue, java.lang.Float discount, java.lang.String itemType, java.math.BigDecimal aged) {
		super(nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES);

		setValue(0, poNumber);
		setValue(1, custNo);
		setValue(2, salesRep);
		setValue(3, orderStatus);
		setValue(4, orderDate);
		setValue(5, shipDate);
		setValue(6, dateNeeded);
		setValue(7, paid);
		setValue(8, qtyOrdered);
		setValue(9, totalValue);
		setValue(10, discount);
		setValue(11, itemType);
		setValue(12, aged);
	}
}
