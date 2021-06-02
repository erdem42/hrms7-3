package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {

	@Autowired
	private JobAdvertisementService jobAdvertisementService;
	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return jobAdvertisementService.add(jobAdvertisement);
	}
	
	
	@GetMapping("/getAllByActiveTrue")
	public DataResult<List<JobAdvertisement>> getAllByActiveTrue(){
		
		return jobAdvertisementService.getAllByActiveTrue();
	}
	
	@GetMapping("/getAllByActiveTrueOrderByReleaseDate")
	public DataResult<List<JobAdvertisement>> getAllByActiveTrueOrderByReleaseDate(){
		
		return jobAdvertisementService.getAllByActiveTrueOrderByReleaseDate();
	}
	

	@GetMapping("/findAllByActiveTrueAndEmployer_Id()")
			
	public DataResult<List<JobAdvertisement>> findAllByActiveTrueAndEmployer_Id(int id){
		
		return jobAdvertisementService.getAllByActiveTrueAndEmployer_Id(id);
	}
	
	@PostMapping("/updateIsActive")
	public Result updateIsActive(int jobAdvertisementId, boolean isActive) {
		return jobAdvertisementService.updateJobAdvertisementIsActive(jobAdvertisementId, isActive);
	}
	
	
}
