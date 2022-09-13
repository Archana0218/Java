package com.tns.emplyoeeservice.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tns.emplyoeeservice.entity.Employee;
import com.tns.emplyoeeservice.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeeRepository eRepo;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return eRepo.findAll();
	}

	@GetMapping("/employees/{id}")
	public Employee getSingleEmployee(@PathVariable Integer id) {
		return eRepo.findById(id).get();
	}

	@PostMapping("/employees")
	public Employee saveEmployeeDetails(@RequestBody Employee employee) {
		return eRepo.save(employee);
	}

	/*
	 * @PutMapping("/employees") 
	 * public Employee updateEmployeeDetails(@RequestBody Employee employee) 
	 * { return eRepo.save(employee); }
	 */
	
	
	@PutMapping("/employees")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee)
	{
		Employee emp = eRepo.findById(employee.getEmp_id()).get();
		emp.setEmp_city(employee.getEmp_city());
		emp.setEmp_dep(employee.getEmp_dep());
		emp.setEmp_name(employee.getEmp_name());
		emp.setEmp_salary(employee.getEmp_salary());
		emp.setShop_id(employee.getShop_id());
		Employee save = eRepo.save(emp);
		return new ResponseEntity(save,HttpStatus.PROCESSING);
	}
		

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable Integer id) {
		Employee emp = eRepo.findById(id).get();
		eRepo.delete(emp);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}