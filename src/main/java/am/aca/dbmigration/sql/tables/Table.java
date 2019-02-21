package am.aca.dbmigration.sql.tables;

import java.util.List;

//TODO

/**
 *  Its hold all JDBC's tables information
 */

public interface Table {

    /**
     * This function correspond save and get JDBC's table name
     *
     * @return JDBC's table name
     */
    String getName();

    /**
     * This function save and get all columns based on specific table
     * @return list of columns
     */
    List getColumns();

    /**
     * This function save and check if table is enabled or not for
     * understanding which tables needs to transfer
     *
     * @return true or false
     */
    boolean isEnabled();

    /**
     * This function set true which user selected and want to transfer
     *
     * @param enabled is checkbox selects by user
     */
    void setEnabled(boolean enabled);
}