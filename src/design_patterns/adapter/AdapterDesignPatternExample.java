package design_patterns.adapter;

public class AdapterDesignPatternExample {

	public static void main(String[] args) {	
		// Adapter pattern works as a bridge between two incompatible interfaces. This
		// type of design pattern comes under structural pattern as this pattern
		// combines the capability of two independent interfaces
		
		AudioPlayer audioPlayer= new AudioPlayer();
		audioPlayer.play("mp3", "sare jaha se accha.mp3");
		audioPlayer.play("mp4", "Tare jami par.mp4");
		audioPlayer.play("vlc", "Every night in my dream.vlc");
		audioPlayer.play("avi", "Brazil laa laa laa.avi");
	}

}
