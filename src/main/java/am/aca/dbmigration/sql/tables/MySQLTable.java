package am.aca.dbmigration.sql.tables;

//TODO
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import am.aca.dbmigration.sql.columns.MySQLColumn;
import am.aca.dbmigration.sql.constraints.MySQLConstraint;

//TODO

/**
 * MySQL type table
 *
 */
public class MySQLTable implements Table{

    private String name;
    private String type;
    private boolean enabled;

    private List<MySQLColumn> columns;
    private List<MySQLConstraint> constraints;


    public MySQLTable(String name, String type) {
        this.name = name;
        this.type = type;
        this.columns = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }


    /**
     * It's check specific table has primary kay constraint
     * @return list of Primary Key MySQLConstraint
     */
    public List<MySQLConstraint> getConstraintByPrimaryKey() {
        List<MySQLConstraint> constraintsByPK = new ArrayList<>();
        for (MySQLConstraint mySQLConstraint : constraints) {
            if ("PRIMARY KEY".equals(mySQLConstraint.getType())) {
                constraintsByPK.add(mySQLConstraint);
            }
        }

        return constraintsByPK.stream().distinct().collect(Collectors.toList());
    }

    /**
     * It's check specific table has foreign kay constraint
     * @return list of Foreign Key MySQLConstraint
     */
    public List<MySQLConstraint> getConstraintByForeignKey() {
        List<MySQLConstraint> constraintsByFK = new ArrayList<>();
        for (MySQLConstraint mySQLConstraint : constraints) {
            if ("FOREIGN KEY".equals(mySQLConstraint.getType())) {
                constraintsByFK.add(mySQLConstraint);
            }
        }
        return constraintsByFK;
    }


    public void addColumn(MySQLColumn column) {
        this.columns.add(column);
    }

    public void addConstraint(MySQLConstraint constraint) {
        this.constraints.add(constraint);
    }

    /**
     * @see Table#getColumns()
     * @return MySql type list of columns
     */
    @Override
    public List<MySQLColumn> getColumns() {
        return new ArrayList<>(columns);
    }

    public void setColumns(List<MySQLColumn> columns) {
        this.columns = columns;
    }

    public List<MySQLConstraint> getConstraints() {
        return new ArrayList<>(constraints);
    }

    public void setConstraints(List<MySQLConstraint> constraints) {
        this.constraints = constraints;
    }

    /**
     * @see Table#getName()
     * @return MySql type name
     */
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @see Table#isEnabled()
     * @return true of false
     */
    @Override
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * @see Table#setEnabled(boolean)
     * @return
     */
    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "MySQLTable{" +
                "name='" + name + '\'' +
                '}';
    }
}
