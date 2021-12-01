package services;



import java.util.Set;


import org.springframework.web.client.RestTemplate;

import com.google.firebase.auth.FirebaseAuth;

import fireBase.FBRequest;
import fireBase.FBResponse;

public class AuthService implements IAuthService{

	@Override
	public boolean createUsers(String email, String password) {
		// TODO Auto-generated method stub
		String url = "https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=AIzaSyCVnSbNZewtr1YMIFFSu4r4K7sVkJxVuEc";
		try {
			RestTemplate rt = new RestTemplate();
			FBRequest request = new FBRequest(email, password, false);
			rt.postForEntity(url, request, FBResponse.class);
			
			return true;
		} catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean login(String email, String password, Set<String> loggedUser) {
		// TODO Auto-generated method stub
		String url = "https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=AIzaSyCVnSbNZewtr1YMIFFSu4r4K7sVkJxVuEc";
		try {
			RestTemplate rt = new RestTemplate();
			FBRequest request = new FBRequest(email, password, true);
			FBResponse response = rt.postForEntity(url, request, FBResponse.class).getBody();
			String userId = FirebaseAuth.getInstance().verifyIdToken(response.getIdToken()).getUid();
			
			
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	

	@Override
	public void logout(String token, Set<String> loggedUser) {
		// TODO Auto-generated method stub
		loggedUser.remove(token);
	}

}
