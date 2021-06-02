package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAllByActiveTrue();
	DataResult<List<JobAdvertisement>> getAllByActiveTrueOrderByReleaseDate();
	DataResult<List<JobAdvertisement>> getAllByActiveTrueAndEmployer_Id(int id);
	Result updateJobAdvertisementIsActive(int jobAdvertisementId,boolean isActive);
	


	
}
