package kodlamaio.hrms.core.verifications;

import kodlamaio.hrms.entities.abstracts.User;

public interface VerificationService {

	void isVerification(String code,User user);
}
