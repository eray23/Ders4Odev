package game;

public class CampaignManager implements CampaignService {
	@Override
	public void addCampaign(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+ " Kampanyas� eklendi.");
	}
	@Override
	public void delCampaign(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+ " Kampanyas� kald�r�ld�.");
	}
	@Override
	public void updateCampaign(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+ " Kampanyas� g�ncellendi.");
	}
}
