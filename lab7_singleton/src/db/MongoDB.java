package db;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class MongoDB implements DB {

    private static volatile DB INSTANCE;

    private MongoDB() {
        System.out.println("new instance MongoDB");
    }

    public static DB getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (PostgreSQL.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new MongoDB();
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
