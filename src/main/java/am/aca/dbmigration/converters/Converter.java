package am.aca.dbmigration.converters;

import am.aca.dbmigration.sql.Schema;

/**
 *
 *
 * @param <T> Source database type
 * @param <R> Destination database type
 */
public interface Converter<T, R> {

    /**
     * This function takes already generated schema of Source database type and
     * convert into Destination database type schema
     * @param schema of Source database type
     * @return Destination database type schema
     */
    Schema<R> convert(Schema<T> schema);

}
