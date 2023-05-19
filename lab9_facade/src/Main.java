public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        YoutubeUploader uploader = new YoutubeUploader("changeit");
        boolean uploaded = uploader.upload("video-content".getBytes());
        System.out.println(uploaded);
    }

}