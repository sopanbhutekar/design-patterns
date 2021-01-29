package design_patterns.adapter.practice;

public class SerialsChannel implements EntertainmentChannelPackage{

	@Override
	public void showMovies() {		
	}

	@Override
	public void showSerials() {
		System.out.println("Showing SERIAL Channels");
		
	}

}
