import entities.Entity;
import entities.Order;
import rest.Response;

public class OrderUpdater extends RestApiUpdater {

    private String json;

    @Override
    Entity retrieve(String id) {
        return new Order(id);
    }

    @Override
    void validateEntity(Entity existingEntity, Entity newEntity) {
        Order order = (Order) existingEntity;
        // validate order
    }

    @Override
    String buildRequest(Entity entity) {
        Order order = (Order) entity;
        return "/order/"+ entity.getId();
    }

    @Override
    public Response makeRequest(String request) {
        String json  = "json"; // from restClient.makeRequest()
        this.json = json;
        return new Response("200", "updated");
    }

    @Override
    public String afterResponse(Response response) {
        return json;
    }
}
