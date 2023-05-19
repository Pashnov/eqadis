public class ApiYoutube {

    private final String apiKey;

    public ApiYoutube(String apiKey) {
        this.apiKey = apiKey;
    }

    boolean upload(byte[] video) {
        System.out.println("upload video to youtube with apiKey: " + apiKey);
        return true;
    }

}
