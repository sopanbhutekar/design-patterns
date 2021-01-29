package design_patterns.adapter.practice;

public class ChannelProvider implements BasicChannelPackage{

	ChannelAdapter channelAdapter;
	
	@Override
	public void show(String channelType) {
		
		if(channelType.equalsIgnoreCase("basic-News")) {
			System.out.println("Showing Basic News Channels");
		}else if(channelType.equalsIgnoreCase("Business-News") ||channelType.equalsIgnoreCase("Business-Insight")||
				channelType.equalsIgnoreCase("Movie") || channelType.equalsIgnoreCase("Serial")
				) {
			channelAdapter= new ChannelAdapter(channelType);
			channelAdapter.show(channelType);
		}else {
			System.out.println("Currently Not Providing channels for Type: "+channelType);
		}
		
	}

}
