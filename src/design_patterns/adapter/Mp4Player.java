package design_patterns.adapter;

public class Mp4Player implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {		
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 from File: "+fileName);		
	}

}
