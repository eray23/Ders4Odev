package game;

public class GameManager implements GameService{
	@Override
	public void buyGame(Games game, User user) {
		System.out.println(user.getFirstName()+" kullan�c�s� "+ game.getGameName()+" oyununu"+game.getPrice()+ " TL'ye sat�n ald�.");
		
	}
	@Override
	public void sellGame(Games game, User user) {
		System.out.println(user.getFirstName()+" kullan�c�s� "+ game.getGameName()+" oyununu"+game.getPrice()+" TL'ye satt�.");
	}
	
}
