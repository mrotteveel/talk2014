talk2014
========

Base code for presentation on Firebird conference Prague 2014

All examples were done using Firebird 3 (snapshot version 3.0.0.31352)

The examples in `nl.lawinegevaar.jaytalk2014.jpajooq` uses the `employee.fdb` example database included with Firebird.

The examples in `nl.lawinegevaar.jaytalk2014.jdbcdemo` require two tables, the DDL is:

    create table identitytable (
       identitycolumn integer generated by default as identity not null,
       valuecolumn varchar(255),
       constraint PK_identitytable primary key (identitycolumn)
    );
    
    create table booleantable (
       id integer generated by default as identity not null,
       boolean1 boolean not null,
       boolean2 boolean
    );
