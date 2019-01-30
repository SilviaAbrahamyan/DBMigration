package am.aca.components.tables;

import java.util.List;

public interface Table {
    boolean isEnabled();

    List getColumns();
    String getName();
}