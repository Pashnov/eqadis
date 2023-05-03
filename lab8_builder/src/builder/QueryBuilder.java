package builder;

public interface QueryBuilder {

    QueryBuilder select(String table);
    QueryBuilder where(String condition);
    QueryBuilder limit(int limit);
    String getSql();

}
