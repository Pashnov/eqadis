package entities;

public class AbstractEntity implements Entity {

    private String id;

    public AbstractEntity(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return null;
    }

}
