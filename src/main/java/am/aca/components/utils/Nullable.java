package am.aca.components.utils;

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
