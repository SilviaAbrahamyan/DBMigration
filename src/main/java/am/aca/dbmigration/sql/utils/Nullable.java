package am.aca.dbmigration.sql.utils;


//TODO

/**
 * Its decides column nullability.
 */
public enum Nullable {

    YES(""),
    NO("NOT NULL");

    private String nullable;

    Nullable(String nullable) {
        this.nullable = nullable;
    }

    @Override
    public String toString() {
        return nullable;
    }
}
