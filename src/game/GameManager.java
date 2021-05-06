package game;

public class GameManager implements GameService{
	@Override
	public void buyGame(Games game, User user) {
		System.out.println(user.getFirstName()+" kullanýcýsý "+ game.getGameName()+" oyununu"+game.getPrice()+ " TL'ye satýn aldý.");
		
	}
	@Override
	public void sellGame(Games game, User user) {
		System.out.println(user.getFirstName()+" kullanýcýsý "+ game.getGameName()+" oyununu"+game.getPrice()+" TL'ye sattý.");
	}
	
}
