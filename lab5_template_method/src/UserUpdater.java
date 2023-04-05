import entities.AbstractEntity;
import entities.Entity;
import entities.User;

public class UserUpdater extends RestApiUpdater {

    @Override
    Entity retrieve(String id) {
        return new User(id);
    }

    @Override
    void validateEntity(Entity existingEntity, Entity newEntity) {
        String existingEmail = ((User) existingEntity).getEmail();
        String newEmail = ((User) newEntity).getEmail();
        if (!existingEmail.equals(newEmail)) {
            throw new RuntimeException("Email can't be updated, id: " + existingEntity.getId());
        }
    }

    @Override
    String buildRequest(Entity entity) {
        return "/user/" + entity.getId();
    }
}
