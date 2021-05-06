package game;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new MernisValidationAdapter());
		userManager.save(new User("Eray","Vural",1234213,new Date(2002,9,23)));
		
		GameManager gameManager = new GameManager();
		gameManager.buyGame(new Games("CSGO",30),new User("Eray","Vural",1234653,new Date(2002,9,23)));
		gameManager.sellGame(new Games("CSGO",35),new User("Eray","Vural",1234653,new Date(2002,9,23)));
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(new Campaigns("İndirim",2));
		campaignManager.delCampaign(new Campaigns("İndirim",2));
		UserManager userManager = new UserManager();
		userManager.delete(new User("Eray","Vural",1234213,new Date(2002,9,23)));
		
		
		
		
		
	

}
}
