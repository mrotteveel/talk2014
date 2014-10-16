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
public class JobRecord extends org.jooq.impl.UpdatableRecordImpl<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.JobRecord> implements org.jooq.Record8<java.lang.String, java.lang.Short, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1133677205;

	/**
	 * Setter for <code>JOB.JOB_CODE</code>.
	 */
	public void setJobCode(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>JOB.JOB_CODE</code>.
	 */
	public java.lang.String getJobCode() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>JOB.JOB_GRADE</code>.
	 */
	public void setJobGrade(java.lang.Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>JOB.JOB_GRADE</code>.
	 */
	public java.lang.Short getJobGrade() {
		return (java.lang.Short) getValue(1);
	}

	/**
	 * Setter for <code>JOB.JOB_COUNTRY</code>.
	 */
	public void setJobCountry(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>JOB.JOB_COUNTRY</code>.
	 */
	public java.lang.String getJobCountry() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>JOB.JOB_TITLE</code>.
	 */
	public void setJobTitle(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>JOB.JOB_TITLE</code>.
	 */
	public java.lang.String getJobTitle() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>JOB.MIN_SALARY</code>.
	 */
	public void setMinSalary(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>JOB.MIN_SALARY</code>.
	 */
	public java.math.BigDecimal getMinSalary() {
		return (java.math.BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>JOB.MAX_SALARY</code>.
	 */
	public void setMaxSalary(java.math.BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>JOB.MAX_SALARY</code>.
	 */
	public java.math.BigDecimal getMaxSalary() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>JOB.JOB_REQUIREMENT</code>.
	 */
	public void setJobRequirement(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>JOB.JOB_REQUIREMENT</code>.
	 */
	public java.lang.String getJobRequirement() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>JOB.LANGUAGE_REQ</code>.
	 */
	public void setLanguageReq(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>JOB.LANGUAGE_REQ</code>.
	 */
	public java.lang.String getLanguageReq() {
		return (java.lang.String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.String, java.lang.Short, java.lang.String> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.Short, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.Short, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Job.JOB.JOB_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Job.JOB.JOB_GRADE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Job.JOB.JOB_COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Job.JOB.JOB_TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Job.JOB.MIN_SALARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field6() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Job.JOB.MAX_SALARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Job.JOB.JOB_REQUIREMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Job.JOB.LANGUAGE_REQ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getJobCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value2() {
		return getJobGrade();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getJobCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getJobTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getMinSalary();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value6() {
		return getMaxSalary();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getJobRequirement();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getLanguageReq();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobRecord value1(java.lang.String value) {
		setJobCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobRecord value2(java.lang.Short value) {
		setJobGrade(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobRecord value3(java.lang.String value) {
		setJobCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobRecord value4(java.lang.String value) {
		setJobTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobRecord value5(java.math.BigDecimal value) {
		setMinSalary(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobRecord value6(java.math.BigDecimal value) {
		setMaxSalary(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobRecord value7(java.lang.String value) {
		setJobRequirement(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobRecord value8(java.lang.String value) {
		setLanguageReq(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobRecord values(java.lang.String value1, java.lang.Short value2, java.lang.String value3, java.lang.String value4, java.math.BigDecimal value5, java.math.BigDecimal value6, java.lang.String value7, java.lang.String value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JobRecord
	 */
	public JobRecord() {
		super(nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Job.JOB);
	}

	/**
	 * Create a detached, initialised JobRecord
	 */
	public JobRecord(java.lang.String jobCode, java.lang.Short jobGrade, java.lang.String jobCountry, java.lang.String jobTitle, java.math.BigDecimal minSalary, java.math.BigDecimal maxSalary, java.lang.String jobRequirement, java.lang.String languageReq) {
		super(nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Job.JOB);

		setValue(0, jobCode);
		setValue(1, jobGrade);
		setValue(2, jobCountry);
		setValue(3, jobTitle);
		setValue(4, minSalary);
		setValue(5, maxSalary);
		setValue(6, jobRequirement);
		setValue(7, languageReq);
	}
}