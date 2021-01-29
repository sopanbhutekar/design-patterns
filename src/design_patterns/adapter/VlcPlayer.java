package design_patterns.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {	
		System.out.println("Playing VLC from File: "+fileName);
	}

	@Override
	public void playMp4(String fileName) {		
	}
}
