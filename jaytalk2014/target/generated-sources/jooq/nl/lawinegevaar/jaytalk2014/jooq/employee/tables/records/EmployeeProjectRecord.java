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
public class EmployeeProjectRecord extends org.jooq.impl.UpdatableRecordImpl<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeProjectRecord> implements org.jooq.Record2<java.lang.Short, java.lang.String> {

	private static final long serialVersionUID = -211020016;

	/**
	 * Setter for <code>EMPLOYEE_PROJECT.EMP_NO</code>.
	 */
	public void setEmpNo(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>EMPLOYEE_PROJECT.EMP_NO</code>.
	 */
	public java.lang.Short getEmpNo() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>EMPLOYEE_PROJECT.PROJ_ID</code>.
	 */
	public void setProjId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>EMPLOYEE_PROJECT.PROJ_ID</code>.
	 */
	public java.lang.String getProjId() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Short, java.lang.String> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Short, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Short, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.EmployeeProject.EMPLOYEE_PROJECT.EMP_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.EmployeeProject.EMPLOYEE_PROJECT.PROJ_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getEmpNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getProjId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeProjectRecord value1(java.lang.Short value) {
		setEmpNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeProjectRecord value2(java.lang.String value) {
		setProjId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeProjectRecord values(java.lang.Short value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EmployeeProjectRecord
	 */
	public EmployeeProjectRecord() {
		super(nl.lawinegevaar.jaytalk2014.jooq.employee.tables.EmployeeProject.EMPLOYEE_PROJECT);
	}

	/**
	 * Create a detached, initialised EmployeeProjectRecord
	 */
	public EmployeeProjectRecord(java.lang.Short empNo, java.lang.String projId) {
		super(nl.lawinegevaar.jaytalk2014.jooq.employee.tables.EmployeeProject.EMPLOYEE_PROJECT);

		setValue(0, empNo);
		setValue(1, projId);
	}
}
