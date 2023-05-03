import builder.MySqlBuilder;
import builder.PostgreSqlBuilder;
import builder.QueryBuilder;

public class Main {

    public static void main(String[] args) {
        QueryBuilder postgreSql = new PostgreSqlBuilder();
        QueryBuilder postgreSql1 = new PostgreSqlBuilder();
        String allNonNullNameUsers = postgreSql.select("users").where("name is not null").getSql();
        String _10NonNullNameUsers = postgreSql1.select("users").where("name is not null").limit(10).getSql();

        QueryBuilder mySql = new MySqlBuilder();
        QueryBuilder mySql1 = new MySqlBuilder();
        String _10Orders = mySql.select("orders").limit(10).getSql();
        String allOrdersPriceMore100 = mySql1.select("orders").where("price > 100").getSql();

        System.out.println(allNonNullNameUsers);
        System.out.println(_10NonNullNameUsers);
        System.out.println(_10Orders);
        System.out.println(allOrdersPriceMore100);

        QueryBuilder postgreSqlError = new PostgreSqlBuilder();
        postgreSqlError.getSql();

    }

}
