/**
 * This class is generated by jOOQ
 */
package nl.lawinegevaar.jaytalk2014.jooq.employee.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employee extends org.jooq.impl.TableImpl<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord> {

	private static final long serialVersionUID = -2093606365;

	/**
	 * The singleton instance of <code>EMPLOYEE</code>
	 */
	public static final nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Employee EMPLOYEE = new nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Employee();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord> getRecordType() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord.class;
	}

	/**
	 * The column <code>EMPLOYEE.EMP_NO</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.lang.Short> EMP_NO = createField("EMP_NO", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>EMPLOYEE.FIRST_NAME</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

	/**
	 * The column <code>EMPLOYEE.LAST_NAME</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>EMPLOYEE.PHONE_EXT</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.lang.String> PHONE_EXT = createField("PHONE_EXT", org.jooq.impl.SQLDataType.VARCHAR.length(4), this, "");

	/**
	 * The column <code>EMPLOYEE.HIRE_DATE</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.sql.Timestamp> HIRE_DATE = createField("HIRE_DATE", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>EMPLOYEE.DEPT_NO</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.lang.String> DEPT_NO = createField("DEPT_NO", org.jooq.impl.SQLDataType.CHAR.length(3).nullable(false), this, "");

	/**
	 * The column <code>EMPLOYEE.JOB_CODE</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.lang.String> JOB_CODE = createField("JOB_CODE", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>EMPLOYEE.JOB_GRADE</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.lang.Short> JOB_GRADE = createField("JOB_GRADE", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>EMPLOYEE.JOB_COUNTRY</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.lang.String> JOB_COUNTRY = createField("JOB_COUNTRY", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

	/**
	 * The column <code>EMPLOYEE.SALARY</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.math.BigDecimal> SALARY = createField("SALARY", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "");

	/**
	 * The column <code>EMPLOYEE.FULL_NAME</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, java.lang.String> FULL_NAME = createField("FULL_NAME", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>EMPLOYEE</code> table reference
	 */
	public Employee() {
		this("EMPLOYEE", null);
	}

	/**
	 * Create an aliased <code>EMPLOYEE</code> table reference
	 */
	public Employee(java.lang.String alias) {
		this(alias, nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Employee.EMPLOYEE);
	}

	private Employee(java.lang.String alias, org.jooq.Table<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord> aliased) {
		this(alias, aliased, null);
	}

	private Employee(java.lang.String alias, org.jooq.Table<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, nl.lawinegevaar.jaytalk2014.jooq.employee.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord> getPrimaryKey() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.Keys.INTEG_27;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord>>asList(nl.lawinegevaar.jaytalk2014.jooq.employee.Keys.INTEG_27);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.EmployeeRecord, ?>>asList(nl.lawinegevaar.jaytalk2014.jooq.employee.Keys.INTEG_28, nl.lawinegevaar.jaytalk2014.jooq.employee.Keys.INTEG_29);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Employee as(java.lang.String alias) {
		return new nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Employee(alias, this);
	}

	/**
	 * Rename this table
	 */
	public nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Employee rename(java.lang.String name) {
		return new nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Employee(name, null);
	}
}