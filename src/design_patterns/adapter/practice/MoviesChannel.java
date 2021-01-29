package design_patterns.adapter.practice;

public class MoviesChannel implements EntertainmentChannelPackage{

	@Override
	public void showMovies() {
		System.out.println("Showing MOVIE Channels");		
	}

	@Override
	public void showSerials() {		
	}

}
