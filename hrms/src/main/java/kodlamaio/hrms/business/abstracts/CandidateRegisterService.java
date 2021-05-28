package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateRegisterService {

	Result add(Candidate candidate);
	Result getAll();
	
}
