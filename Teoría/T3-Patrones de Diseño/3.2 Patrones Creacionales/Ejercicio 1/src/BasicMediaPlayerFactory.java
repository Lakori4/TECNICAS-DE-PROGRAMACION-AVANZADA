public class BasicMediaPlayerFactory implements MediaPlayerFactory{
    @Override
    public AudioPlayer createAudioPlayer() {
        return new BasicAudioPlayer();
    }

    @Override
    public VideoPlayer createVideoPlayer() {
        return new BasicVideoPlayer();
    }
}
