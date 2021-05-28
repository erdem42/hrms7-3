package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.concretes.JobTitleManager;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobTitle;

@RestController		//cihaza göre görünümü ayarlar
@RequestMapping("/api/jobpositions")
public class JobTitleController {
	@Autowired
	private JobTitleManager jobTitleManager;

	
	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll(){
		return jobTitleManager.getAll();
	}
	
	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle) {
		return jobTitleManager.addTitle(jobTitle);
	}
	

}
