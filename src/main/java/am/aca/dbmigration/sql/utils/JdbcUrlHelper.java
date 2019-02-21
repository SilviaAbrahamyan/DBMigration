package am.aca.dbmigration.sql.utils;


//TODO

public class JdbcUrlHelper {

    /**
     * its decides jdbc type based on jdbc url for understanding
     * which jdbc type of transfer is needed
     *
     * @param jdbcUrl is source or destination database url
     * @return jdbc type
     */
    public static String getDbType(String jdbcUrl) {
        int firstIndex = jdbcUrl.indexOf(":") + 1;
        return jdbcUrl.substring(firstIndex, jdbcUrl.indexOf(":", firstIndex));
    }

    /**
     * its decides database name based on jdbc url for understanding
     * which database name of transfer is needed
     *
     * @param jdbcUrl is source or destination database url
     * @return database name
     */
    public static String getDbName(String jdbcUrl) {
        int firstIndex = jdbcUrl.lastIndexOf("/") + 1;
        return jdbcUrl.substring(firstIndex, jdbcUrl.length());
    }
}
