package fireBase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FBResponse {

	private String idToken;
	private String email;
	private String refreshToken;
	private String expiresin;
	private String localId;
	private Boolean registered;
	
}
