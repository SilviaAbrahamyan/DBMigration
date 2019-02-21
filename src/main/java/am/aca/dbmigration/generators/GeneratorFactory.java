package am.aca.dbmigration.generators;

import am.aca.dbmigration.sql.tables.Table;
import am.aca.dbmigration.sql.utils.JdbcUrlHelper;


public class GeneratorFactory {

    /**
     * It takes the JDBC url extracts the database type and specifies the Generator
     *
     * @param url is the JDBC url of destination database
     * @return Specific type Generator based on destination database information
     */
    public static Generator<? extends Table> getGenerator(String url) {

        String type = JdbcUrlHelper.getDbType(url);

        switch (type) {
            case "mysql":
                return new MySQLGenarator();
            case "postgresql":
                return new PostgreSQLGenerator();
            default:
                throw new UnsupportedOperationException("Unsupported RDBMS");
        }
    }
}
