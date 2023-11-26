public class AdvancedMediaPlayerFactory implements MediaPlayerFactory{
    @Override
    public AudioPlayer createAudioPlayer() {
        return new AdvancedAudioPlayer();
    }

    @Override
    public VideoPlayer createVideoPlayer() {
        return new AdvancedVideoPlayer();
    }
}
