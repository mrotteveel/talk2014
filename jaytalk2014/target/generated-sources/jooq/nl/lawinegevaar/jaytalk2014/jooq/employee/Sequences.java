/**
 * This class is generated by jOOQ
 */
package nl.lawinegevaar.jaytalk2014.jooq.employee;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in 
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>CUST_NO_GEN</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> CUST_NO_GEN = new org.jooq.impl.SequenceImpl<java.lang.Long>("CUST_NO_GEN", nl.lawinegevaar.jaytalk2014.jooq.employee.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence <code>EMP_NO_GEN</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> EMP_NO_GEN = new org.jooq.impl.SequenceImpl<java.lang.Long>("EMP_NO_GEN", nl.lawinegevaar.jaytalk2014.jooq.employee.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence <code>SQL$DEFAULT</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SQL$DEFAULT = new org.jooq.impl.SequenceImpl<java.lang.Long>("SQL$DEFAULT", nl.lawinegevaar.jaytalk2014.jooq.employee.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);
}
