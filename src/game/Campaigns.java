package game;


public class Campaigns {
	private String campaignName;
	private int campaignNo;
	
	public Campaigns(String campaignName, int campaignNo) {
		super();
		this.campaignName = campaignName;
		this.campaignNo = campaignNo;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getCampaignNo() {
		return campaignNo;
	}
	public void setCampaignNo(int campaignNo) {
		this.campaignNo = campaignNo;
	}
	
}
