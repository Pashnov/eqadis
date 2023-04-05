import entities.Entity;
import entities.Product;

public class ProductUpdater extends RestApiUpdater {

    private Messenger messenger;

    public ProductUpdater(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    Entity retrieve(String id) {
        return new Product(id);
    }

    @Override
    void validateEntity(Entity existingEntity, Entity newEntity) {
        // validate
        boolean valid = !newEntity.getId().isBlank();
        if (!valid) {
            messenger.send("Product validation failed, id: " + newEntity.getId());
            throw new RuntimeException("Product validation failed, id: " + newEntity.getId());
        }
    }

    @Override
    String buildRequest(Entity entity) {
        return "/product/" + entity.getId();
    }
}
