package kodlamaio.hrms.business.concretes;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	@Autowired
	private JobAdvertisementDao jobAdvertisementDao;

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		jobAdvertisement.setReleaseDate(LocalDate.now());
		jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("job advertiesement added");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByActiveTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAllByIsActiveTrue());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByActiveTrueOrderByReleaseDate() {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAllByIsActiveTrueOrderByReleaseDateDesc());

	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByActiveTrueAndEmployer_Id(int id) {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAllByIsActiveTrueAndEmployer_Id(id));

	}

	@Override
	public Result updateJobAdvertisementIsActive(int jobAdvertisementId, boolean isActive) {
		jobAdvertisementDao.findById(jobAdvertisementId).get().setActive(isActive);
		
		jobAdvertisementDao.save(jobAdvertisementDao.findById(jobAdvertisementId).get());

		return new SuccessResult("jobAdvertisement isActive updated");
	}

}
