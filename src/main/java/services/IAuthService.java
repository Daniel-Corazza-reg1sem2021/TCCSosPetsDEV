package services;

import java.util.Set;

public interface IAuthService {
	boolean createUsers (String email, String password);
	
	boolean login (String email, String password, Set<String> loggedUser);
	
	void logout (String token, Set<String> loggedUser);
	
	
}
