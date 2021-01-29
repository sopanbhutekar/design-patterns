package design_patterns.adapter;

public class MediaAdapter implements MediaPlayer{
	
	AdvanceMediaPlayer advanceMediaPlayer=null;
	
	MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer= new Mp4Player();
		}else if(audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer= new VlcPlayer();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer.playMp4(fileName);
		}else if(audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer.playVlc(fileName);
		}		
		
	}
}
