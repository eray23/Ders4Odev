package game;

public class CampaignManager implements CampaignService {
	@Override
	public void addCampaign(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+ " Kampanyasý eklendi.");
	}
	@Override
	public void delCampaign(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+ " Kampanyasý kaldýrýldý.");
	}
	@Override
	public void updateCampaign(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+ " Kampanyasý güncellendi.");
	}
}
