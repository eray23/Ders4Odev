package game;

public class UserManager implements UserService{
	
private UserValidationService userValidationService;
	

	public UserManager(UserValidationService userValidationService) {
		
		this.userValidationService = userValidationService;
		
		
	}
	
	
	
	
	@Override
	public void save(User user) {
		System.out.println(user.getFirstName()+" �ye olma i�leminiz ba�ar�l�.");
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" adl� kullan�c� art�k �ye de�il.");
	}
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" adl� kullan�c� g�ncellendi");
	}
}
