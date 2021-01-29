package design_patterns.adapter.practice;

public class AdapterPracticeExample {

	public static void main(String[] args) {
		ChannelProvider channelProvider= new ChannelProvider();
		channelProvider.show("Business-News");
		channelProvider.show("Movie");
		channelProvider.show("Serial");
		channelProvider.show("Business-Insight");
		channelProvider.show("Porn");

	}

}
