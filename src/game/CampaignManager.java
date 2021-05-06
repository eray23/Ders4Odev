package game;

public class CampaignManager implements CampaignService {
	@Override
	public void addCampaign(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+ " Kampanyası eklendi.");
	}
	@Override
	public void delCampaign(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+ " Kampanyası kaldırıldı.");
	}
	@Override
	public void updateCampaign(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+ " Kampanyası güncellendi.");
	}
}
