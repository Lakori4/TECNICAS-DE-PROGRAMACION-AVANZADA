public class MainFactory {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MediaPlayerFactory factory = new BasicMediaPlayerFactory();
        AudioPlayer basicAudio = factory.createAudioPlayer();
        VideoPlayer basicVideo = factory.createVideoPlayer();

        basicAudio.playAudio();
        basicVideo.playVideo();

        factory = new AdvancedMediaPlayerFactory();
        AudioPlayer advancedAudio = factory.createAudioPlayer();
        VideoPlayer advancedVideo = factory.createVideoPlayer();

        advancedAudio.playAudio();
        advancedVideo.playVideo();
    }
}