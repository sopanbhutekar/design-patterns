package design_patterns.adapter.practice;

public class BusinessInsightChannel implements BusinessChannelPackage{

	@Override
	public void showBussinessNews() {		
	}

	@Override
	public void showBussinessInsights() {	
		System.out.println("Showing Business INSIGHT Channels");
	}

}

