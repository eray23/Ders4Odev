package game;

public class UserManager implements UserService{
	
private UserValidationService userValidationService;
	

	public UserManager(UserValidationService userValidationService) {
		
		this.userValidationService = userValidationService;
		
		
	}
	
	
	
	
	@Override
	public void save(User user) {
		System.out.println(user.getFirstName()+" üye olma iþleminiz baþarýlý.");
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" adlý kullanýcý artýk üye deðil.");
	}
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" adlý kullanýcý güncellendi");
	}
}
