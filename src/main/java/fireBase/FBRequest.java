package fireBase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FBRequest {
	
	private String email;
	private String password;
	private Boolean returnSecureToken;
	
}
