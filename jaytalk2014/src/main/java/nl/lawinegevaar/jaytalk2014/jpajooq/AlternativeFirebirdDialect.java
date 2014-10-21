package nl.lawinegevaar.jaytalk2014.jpajooq;

import org.hibernate.dialect.FirebirdDialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.type.StandardBasicTypes;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class AlternativeFirebirdDialect extends FirebirdDialect {
    public AlternativeFirebirdDialect() {
        registerFunction( "substring", new SQLFunctionTemplate( StandardBasicTypes.STRING, "substring(?1 from ?2 for ?3)" ) );
    }
}
