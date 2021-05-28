package kodlamaio.hrms.core.verifications;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.abstracts.User;

@Service
public class EmailVerification implements VerificationService {

	@Override
	public void isVerification(String code,User user) {

		user.setActivated(true);
	}

}
