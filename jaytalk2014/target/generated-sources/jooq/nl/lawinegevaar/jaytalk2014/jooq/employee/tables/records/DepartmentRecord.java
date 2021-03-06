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
public class DepartmentRecord extends org.jooq.impl.UpdatableRecordImpl<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.DepartmentRecord> implements org.jooq.Record7<java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.math.BigDecimal, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 450685440;

	/**
	 * Setter for <code>DEPARTMENT.DEPT_NO</code>.
	 */
	public void setDeptNo(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>DEPARTMENT.DEPT_NO</code>.
	 */
	public java.lang.String getDeptNo() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>DEPARTMENT.DEPARTMENT</code>.
	 */
	public void setDepartment(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>DEPARTMENT.DEPARTMENT</code>.
	 */
	public java.lang.String getDepartment() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>DEPARTMENT.HEAD_DEPT</code>.
	 */
	public void setHeadDept(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>DEPARTMENT.HEAD_DEPT</code>.
	 */
	public java.lang.String getHeadDept() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>DEPARTMENT.MNGR_NO</code>.
	 */
	public void setMngrNo(java.lang.Short value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>DEPARTMENT.MNGR_NO</code>.
	 */
	public java.lang.Short getMngrNo() {
		return (java.lang.Short) getValue(3);
	}

	/**
	 * Setter for <code>DEPARTMENT.BUDGET</code>.
	 */
	public void setBudget(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>DEPARTMENT.BUDGET</code>.
	 */
	public java.math.BigDecimal getBudget() {
		return (java.math.BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>DEPARTMENT.LOCATION</code>.
	 */
	public void setLocation(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>DEPARTMENT.LOCATION</code>.
	 */
	public java.lang.String getLocation() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>DEPARTMENT.PHONE_NO</code>.
	 */
	public void setPhoneNo(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>DEPARTMENT.PHONE_NO</code>.
	 */
	public java.lang.String getPhoneNo() {
		return (java.lang.String) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.math.BigDecimal, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.math.BigDecimal, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Department.DEPARTMENT.DEPT_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Department.DEPARTMENT.DEPARTMENT_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Department.DEPARTMENT.HEAD_DEPT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field4() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Department.DEPARTMENT.MNGR_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Department.DEPARTMENT.BUDGET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Department.DEPARTMENT.LOCATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Department.DEPARTMENT.PHONE_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getDeptNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDepartment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getHeadDept();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value4() {
		return getMngrNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getBudget();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getLocation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getPhoneNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value1(java.lang.String value) {
		setDeptNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value2(java.lang.String value) {
		setDepartment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value3(java.lang.String value) {
		setHeadDept(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value4(java.lang.Short value) {
		setMngrNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value5(java.math.BigDecimal value) {
		setBudget(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value6(java.lang.String value) {
		setLocation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value7(java.lang.String value) {
		setPhoneNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Short value4, java.math.BigDecimal value5, java.lang.String value6, java.lang.String value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DepartmentRecord
	 */
	public DepartmentRecord() {
		super(nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Department.DEPARTMENT);
	}

	/**
	 * Create a detached, initialised DepartmentRecord
	 */
	public DepartmentRecord(java.lang.String deptNo, java.lang.String department, java.lang.String headDept, java.lang.Short mngrNo, java.math.BigDecimal budget, java.lang.String location, java.lang.String phoneNo) {
		super(nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Department.DEPARTMENT);

		setValue(0, deptNo);
		setValue(1, department);
		setValue(2, headDept);
		setValue(3, mngrNo);
		setValue(4, budget);
		setValue(5, location);
		setValue(6, phoneNo);
	}
}
