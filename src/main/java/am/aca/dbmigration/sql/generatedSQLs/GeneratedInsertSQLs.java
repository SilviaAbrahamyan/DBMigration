package am.aca.dbmigration.sql.generatedSQLs;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class GeneratedInsertSQLs {
    private static List<String> insertSQLs = new ArrayList<>();

    public static void add(String s) {
        insertSQLs.add(s);
    }

    public static List<String> getGeneratedInsertSQLs() {
        return insertSQLs;
    }

    public static void emptyList() {
        insertSQLs = new ArrayList<>();
    }
}
