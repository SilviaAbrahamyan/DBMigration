package am.aca.dbmigration.converters;

import am.aca.dbmigration.sql.utils.JdbcUrlHelper;

//TODO
public class ConverterFactory {

    /**
     * It takes the JDBC url extracts the database type and specifies the Converter
     *
     * @param urlFrom  of the source database
     * @param urlTo  of the destination database
     * @return Specific type Converter based on destination database type
     */
    public static Converter getConverter(String urlFrom, String urlTo) {

        String from = JdbcUrlHelper.getDbType(urlFrom);
        String to = JdbcUrlHelper.getDbType(urlTo);

        switch (from) {
            case "postgresql": {
                switch (to) {
                    case "mysql":
                        return new PostgreSQLToMySQL();
                    default:
                        throw new UnsupportedOperationException("Unsupported RDBMS");
                }
            }

            case "mysql": {
                switch (to) {
                    case "postgresql":
                        return new MySQLToPostgreSql();
                    default:
                        throw new UnsupportedOperationException("Unsupported RDBMS");
                }
            }

            default:
                throw new UnsupportedOperationException("Unsupported RDBMS");
        }
    }
}
