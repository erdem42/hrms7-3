package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateRegisterService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.validates.ValidateService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateRegisterManager implements CandidateRegisterService {

	@Autowired
	private CandidateDao candidateDao;
	@Autowired
	ValidateService validateService;
	
	
	@Override
	public Result add(Candidate candidate) {
		
		if(!validateService.checkIfRealPerson(candidate))
			return new ErrorResult("İnvalid person");
		
		if(candidateDao.existsByEmail(candidate.getEmail())||candidateDao.existsByNationalityId(candidate.getNationalityId()))
			return new ErrorResult("Invalid email or NationalityId");
		
		if(!candidate.isActivated())
			return new ErrorResult("Invalid code");
		
		candidateDao.save(candidate);
		return new SuccessResult("added");
	}

	@Override
	public Result getAll() {

		return new SuccessDataResult<>(this.candidateDao.findAll(),"Data listed");
	}
	
	

	
}
