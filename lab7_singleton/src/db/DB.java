package db;

import java.util.HashMap;
import java.util.List;

public interface DB {

    void query(String sql);
    HashMap<String, String> readOne(String sql);
    List<HashMap<String, String>> readMany(String sql);

}
