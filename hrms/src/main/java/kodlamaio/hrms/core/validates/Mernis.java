package kodlamaio.hrms.core.validates;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.abstracts.User;

@Service
public class Mernis implements ValidateService{

	@Override
	public boolean checkIfRealPerson( User user) {
         return	true;	
	}

}
