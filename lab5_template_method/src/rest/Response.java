package rest;

public class Response {

    public String code;
    public String status;

    public Response(String code, String status) {
        this.code = code;
        this.status = status;
    }
}
