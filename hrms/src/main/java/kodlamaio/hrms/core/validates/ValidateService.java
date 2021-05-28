package kodlamaio.hrms.core.validates;

import kodlamaio.hrms.entities.abstracts.User;

public interface ValidateService {

	boolean checkIfRealPerson(User user);
}
