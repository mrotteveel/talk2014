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
public class Sales extends org.jooq.impl.TableImpl<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord> {

	private static final long serialVersionUID = -272544910;

	/**
	 * The singleton instance of <code>SALES</code>
	 */
	public static final nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales SALES = new nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord> getRecordType() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord.class;
	}

	/**
	 * The column <code>SALES.PO_NUMBER</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.lang.String> PO_NUMBER = createField("PO_NUMBER", org.jooq.impl.SQLDataType.CHAR.length(8).nullable(false), this, "");

	/**
	 * The column <code>SALES.CUST_NO</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.lang.Integer> CUST_NO = createField("CUST_NO", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>SALES.SALES_REP</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.lang.Short> SALES_REP = createField("SALES_REP", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>SALES.ORDER_STATUS</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.lang.String> ORDER_STATUS = createField("ORDER_STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(7).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>SALES.ORDER_DATE</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.sql.Timestamp> ORDER_DATE = createField("ORDER_DATE", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>SALES.SHIP_DATE</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.sql.Timestamp> SHIP_DATE = createField("SHIP_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>SALES.DATE_NEEDED</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.sql.Timestamp> DATE_NEEDED = createField("DATE_NEEDED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>SALES.PAID</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.lang.String> PAID = createField("PAID", org.jooq.impl.SQLDataType.CHAR.length(1).defaulted(true), this, "");

	/**
	 * The column <code>SALES.QTY_ORDERED</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.lang.Integer> QTY_ORDERED = createField("QTY_ORDERED", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>SALES.TOTAL_VALUE</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.math.BigDecimal> TOTAL_VALUE = createField("TOTAL_VALUE", org.jooq.impl.SQLDataType.DECIMAL.precision(9, 2).nullable(false), this, "");

	/**
	 * The column <code>SALES.DISCOUNT</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.lang.Float> DISCOUNT = createField("DISCOUNT", org.jooq.impl.SQLDataType.REAL.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>SALES.ITEM_TYPE</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.lang.String> ITEM_TYPE = createField("ITEM_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(12).nullable(false), this, "");

	/**
	 * The column <code>SALES.AGED</code>.
	 */
	public final org.jooq.TableField<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, java.math.BigDecimal> AGED = createField("AGED", org.jooq.impl.SQLDataType.DECIMAL, this, "");

	/**
	 * Create a <code>SALES</code> table reference
	 */
	public Sales() {
		this("SALES", null);
	}

	/**
	 * Create an aliased <code>SALES</code> table reference
	 */
	public Sales(java.lang.String alias) {
		this(alias, nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales.SALES);
	}

	private Sales(java.lang.String alias, org.jooq.Table<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Sales(java.lang.String alias, org.jooq.Table<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, nl.lawinegevaar.jaytalk2014.jooq.employee.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord> getPrimaryKey() {
		return nl.lawinegevaar.jaytalk2014.jooq.employee.Keys.INTEG_76;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord>>asList(nl.lawinegevaar.jaytalk2014.jooq.employee.Keys.INTEG_76);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<nl.lawinegevaar.jaytalk2014.jooq.employee.tables.records.SalesRecord, ?>>asList(nl.lawinegevaar.jaytalk2014.jooq.employee.Keys.INTEG_77, nl.lawinegevaar.jaytalk2014.jooq.employee.Keys.INTEG_78);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales as(java.lang.String alias) {
		return new nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales(alias, this);
	}

	/**
	 * Rename this table
	 */
	public nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales rename(java.lang.String name) {
		return new nl.lawinegevaar.jaytalk2014.jooq.employee.tables.Sales(name, null);
	}
}
