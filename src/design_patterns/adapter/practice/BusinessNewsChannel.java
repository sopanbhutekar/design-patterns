package design_patterns.adapter.practice;

public class BusinessNewsChannel implements BusinessChannelPackage{

	@Override
	public void showBussinessNews() {
		System.out.println("Showing Business NEWS Chnanels");		
	}

	@Override
	public void showBussinessInsights() {		
	}

}
