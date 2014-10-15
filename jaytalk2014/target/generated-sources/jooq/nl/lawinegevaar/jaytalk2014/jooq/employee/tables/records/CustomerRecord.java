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
public class CustomerRecord extends org.jooq.impl.UpdatableRecordImpl<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.CustomerRecord> implements org.jooq.Record12<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1619807600;

	/**
	 * Setter for <code>CUSTOMER.CUST_NO</code>.
	 */
	public void setCustNo(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>CUSTOMER.CUST_NO</code>.
	 */
	public java.lang.Integer getCustNo() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>CUSTOMER.CUSTOMER</code>.
	 */
	public void setCustomer(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>CUSTOMER.CUSTOMER</code>.
	 */
	public java.lang.String getCustomer() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>CUSTOMER.CONTACT_FIRST</code>.
	 */
	public void setContactFirst(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>CUSTOMER.CONTACT_FIRST</code>.
	 */
	public java.lang.String getContactFirst() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>CUSTOMER.CONTACT_LAST</code>.
	 */
	public void setContactLast(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>CUSTOMER.CONTACT_LAST</code>.
	 */
	public java.lang.String getContactLast() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>CUSTOMER.PHONE_NO</code>.
	 */
	public void setPhoneNo(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>CUSTOMER.PHONE_NO</code>.
	 */
	public java.lang.String getPhoneNo() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>CUSTOMER.ADDRESS_LINE1</code>.
	 */
	public void setAddressLine1(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>CUSTOMER.ADDRESS_LINE1</code>.
	 */
	public java.lang.String getAddressLine1() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>CUSTOMER.ADDRESS_LINE2</code>.
	 */
	public void setAddressLine2(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>CUSTOMER.ADDRESS_LINE2</code>.
	 */
	public java.lang.String getAddressLine2() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>CUSTOMER.CITY</code>.
	 */
	public void setCity(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>CUSTOMER.CITY</code>.
	 */
	public java.lang.String getCity() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>CUSTOMER.STATE_PROVINCE</code>.
	 */
	public void setStateProvince(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>CUSTOMER.STATE_PROVINCE</code>.
	 */
	public java.lang.String getStateProvince() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>CUSTOMER.COUNTRY</code>.
	 */
	public void setCountry(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>CUSTOMER.COUNTRY</code>.
	 */
	public java.lang.String getCountry() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>CUSTOMER.POSTAL_CODE</code>.
	 */
	public void setPostalCode(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>CUSTOMER.POSTAL_CODE</code>.
	 */
	public java.lang.String getPostalCode() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>CUSTOMER.ON_HOLD</code>.
	 */
	public void setOnHold(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>CUSTOMER.ON_HOLD</code>.
	 */
	public java.lang.String getOnHold() {
		return (java.lang.String) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.CUST_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.CUSTOMER_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.CONTACT_FIRST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.CONTACT_LAST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.PHONE_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.ADDRESS_LINE1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.ADDRESS_LINE2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.STATE_PROVINCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.POSTAL_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER.ON_HOLD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getCustNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCustomer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getContactFirst();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getContactLast();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPhoneNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getAddressLine1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getAddressLine2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getStateProvince();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getPostalCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getOnHold();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value1(java.lang.Integer value) {
		setCustNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value2(java.lang.String value) {
		setCustomer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value3(java.lang.String value) {
		setContactFirst(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value4(java.lang.String value) {
		setContactLast(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value5(java.lang.String value) {
		setPhoneNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value6(java.lang.String value) {
		setAddressLine1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value7(java.lang.String value) {
		setAddressLine2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value8(java.lang.String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value9(java.lang.String value) {
		setStateProvince(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value10(java.lang.String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value11(java.lang.String value) {
		setPostalCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord value12(java.lang.String value) {
		setOnHold(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.String value12) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CustomerRecord
	 */
	public CustomerRecord() {
		super(nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER);
	}

	/**
	 * Create a detached, initialised CustomerRecord
	 */
	public CustomerRecord(java.lang.Integer custNo, java.lang.String customer, java.lang.String contactFirst, java.lang.String contactLast, java.lang.String phoneNo, java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String city, java.lang.String stateProvince, java.lang.String country, java.lang.String postalCode, java.lang.String onHold) {
		super(nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Customer.CUSTOMER);

		setValue(0, custNo);
		setValue(1, customer);
		setValue(2, contactFirst);
		setValue(3, contactLast);
		setValue(4, phoneNo);
		setValue(5, addressLine1);
		setValue(6, addressLine2);
		setValue(7, city);
		setValue(8, stateProvince);
		setValue(9, country);
		setValue(10, postalCode);
		setValue(11, onHold);
	}
}
