package builder;

import java.util.Objects;

public class PostgreSqlBuilder implements QueryBuilder {

    private String select;
    private String where;
    private String limit;

    @Override
    public QueryBuilder select(String table) {
        this.select = table;
        return this;
    }

    @Override
    public QueryBuilder where(String condition) {
        this.where = condition;
        return this;
    }

    @Override
    public QueryBuilder limit(int limit) {
        this.limit = limit+"";
        return this;
    }

    @Override
    public String getSql() {
        if (Objects.isNull(select)) {
            throw new IllegalArgumentException("The table must be set");
        }
        StringBuilder sb = new StringBuilder("SELECT * FROM " + select + " ");
        if (Objects.nonNull(where)) {
            sb.append("WHERE ").append(where).append(" ");
        }
        if (Objects.nonNull(limit)) {
            sb.append("LIMIT ").append(limit).append(" ");
        }
        sb.append(";");

        return sb.toString();
    }

}
