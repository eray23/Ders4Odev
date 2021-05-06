package game;

public interface GameService {
	void buyGame(Games game, User user);
	void sellGame(Games game, User user);
}
