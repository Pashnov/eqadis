public class YoutubeUploader {

    private final ApiYoutube apiYoutube;
    private final YoutubeFormatEncoder encoder;

    public YoutubeUploader(String apiKey) {
        this.apiYoutube = new ApiYoutube(apiKey);
        this.encoder = new YoutubeFormatEncoder();
    }

    boolean upload(byte[] video) {
        byte[] encodedVideo = encoder.encode(video);
        return apiYoutube.upload(encodedVideo);
    }
}
