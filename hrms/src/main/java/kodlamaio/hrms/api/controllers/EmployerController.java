package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerRegisterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {

	@Autowired
	private EmployerRegisterService employerRegisterService;
	
	@GetMapping("/getAllEmployer")
	public DataResult<List<Employer>> getAll(){
		
		return this.employerRegisterService.getAll();
	}
	
	@PostMapping("/addEmployer")
	public Result addEmployer(@RequestBody Employer employer) {
		return this.employerRegisterService.addEmployer(employer);
	}
}
