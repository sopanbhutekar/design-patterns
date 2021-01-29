package design_patterns.adapter.practice;

public class ChannelAdapter implements BasicChannelPackage{

	EntertainmentChannelPackage entertainmentChannelPackage;
	BusinessChannelPackage businessChannelPackage;
	
	ChannelAdapter(String channelType){
		if(channelType.equalsIgnoreCase("Business-News")) {
			businessChannelPackage= new BusinessNewsChannel();
		}else if(channelType.equalsIgnoreCase("Business-Insight")) {
			businessChannelPackage= new BusinessInsightChannel();
		}else if(channelType.equalsIgnoreCase("Movie")) {
			entertainmentChannelPackage= new MoviesChannel();
		}else if(channelType.equalsIgnoreCase("Serial")) {
			entertainmentChannelPackage= new SerialsChannel();
		}
	}
	
	@Override
	public void show(String channelType) {		
		if(channelType.equalsIgnoreCase("Business-News")) {
			businessChannelPackage.showBussinessNews();
		}else if(channelType.equalsIgnoreCase("Business-Insight")) {
			businessChannelPackage.showBussinessInsights();
		}else if(channelType.equalsIgnoreCase("Movie")) {
			entertainmentChannelPackage.showMovies();
		}else if(channelType.equalsIgnoreCase("Serial")) {
			entertainmentChannelPackage.showSerials();
		}
		
	}

}
