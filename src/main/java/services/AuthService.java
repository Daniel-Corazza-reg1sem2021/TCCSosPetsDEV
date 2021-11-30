package services;

import java.net.URI;
import java.util.Set;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserRecord;

public class AuthService implements IAuthService{

	@Override
	public boolean createUsers(String email, String password) {
		// TODO Auto-generated method stub
		FirebaseAuth auth = FirebaseAuth.getInstance();
		UserRecord.CreateRequest request = new UserRecord.CreateRequest();
		request.setEmail(email);
		request.setPassword(password);
		
		try {
			auth.createUser(request);
			return true;
		}
		catch(Exception e) {
			return false;
		}
		
		
	}

	@Override
	public boolean login(String email, String password, Set<String> loggedUser) {
		// TODO Auto-generated method stub
		RestTemplate rt = new RestTemplate();
		UserRecord.CreateRequest request = new UserRecord.CreateRequest();
		request.setEmail(email);
		request.setPassword(password);
		
		
		try {
			URI uri = URI.create(
					"https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=AIzaSyCVnSbNZewtr1YMIFFSu4r4K7sVkJxVuEc"
					);
			UserRecord record = rt.postForEntity(uri, request, UserRecord.class).getBody();
			String userIdTest = record.getUid();
			loggedUser.add(userIdTest);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public void logout(String token, Set<String> loggedUser) {
		// TODO Auto-generated method stub
		loggedUser.remove(token);
	}

}
