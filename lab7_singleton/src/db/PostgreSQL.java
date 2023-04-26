package db;

import java.util.*;

public class PostgreSQL implements DB {

    private static volatile DB INSTANCE;

    private PostgreSQL() {
        System.out.println("new instance PostgreSQL");
    }

    public static DB getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (PostgreSQL.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new PostgreSQL();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void query(String sql) {

    }

    @Override
    public HashMap<String, String> readOne(String sql) {
        return new HashMap<>();
    }

    @Override
    public List<HashMap<String, String>> readMany(String sql) {
        return Collections.emptyList();
    }
}
