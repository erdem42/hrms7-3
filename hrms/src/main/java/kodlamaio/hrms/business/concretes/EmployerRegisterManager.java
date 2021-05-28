package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerRegisterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
@Service
public class EmployerRegisterManager implements EmployerRegisterService{

	@Autowired
	private EmployerDao employerDao;
	
	
	@Override
	public Result addEmployer(Employer employer) {

		
		if(!employer.isActivated())
			return new ErrorResult("employer not activeted");
		if(employerDao.existsByEmail(employer.getEmail()))
			return new ErrorResult("Email already exists");
		if(!(employer.getEmail().substring(employer.getEmail().indexOf('@')+1).equals
						(employer.getWebAddress().substring(4)))){
			return new ErrorResult("Web address must be same with email");
		}
		
		employerDao.save(employer);
		return new SuccessResult("Data added");
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<>(employerDao.findAll(),"Data listed");
	}

}
