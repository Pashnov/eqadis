import entities.Entity;
import rest.Response;

public abstract class RestApiUpdater {

    public void updateEntity(Entity updateEntity) {
        Entity existingEntity = retrieve(updateEntity.getId());
        validateEntity(existingEntity, updateEntity);
        String request = buildRequest(updateEntity);
        request = updateRequest(request);
        Response response = makeRequest(request);
        afterResponse(response);
    }

    abstract Entity retrieve(String id);
    abstract void validateEntity(Entity existingEntity, Entity newEntity);
    abstract String buildRequest(Entity entity);

    public Response makeRequest(String request) {
        // restClient.makeRequest()
        return new Response("200", "updated");
    }

    public String updateRequest(String request) {
        return request;
    }

    public String afterResponse(Response response) {
        return null;
    }

}
