package am.aca.dbmigration.generators;

import am.aca.dbmigration.sql.Schema;

import java.sql.SQLException;

//TODO

/**
 * @param <T> Destination database type
 */
public interface Generator<T> {

    /**
     * This function get already generated Destination database type schema,
     * start to created sql queries and warning and save in list
     * @param schema Destination database type schema
     * @throws SQLException
     */
    void generateSQLOf(Schema<T> schema) throws SQLException;

}
