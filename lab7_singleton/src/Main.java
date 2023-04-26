import db.DB;
import db.MongoDB;
import db.PostgreSQL;

public class Main {

    public static void main(String[] args) {
        DB db1 = PostgreSQL.getInstance();
        DB db2 = MongoDB.getInstance();
        var db3 = PostgreSQL.getInstance();
        System.out.println(db1 == db3);
    }

}
