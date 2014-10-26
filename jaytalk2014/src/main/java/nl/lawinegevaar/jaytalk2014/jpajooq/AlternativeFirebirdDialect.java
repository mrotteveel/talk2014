/*
 * Copyright (c) 2014, Mark Rotteveel
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
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
