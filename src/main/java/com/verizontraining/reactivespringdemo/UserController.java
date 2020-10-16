package com.verizontraining.reactivespringdemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoAction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/welcome")
	public Mono<String> welcome() {
		return Mono.just("Welcome");
	}
	
	@PostMapping("/user")
	public Mono<Employee> saveUser(@RequestBody Employee employee) {
		
		return employeeRepository.save(employee);
		//return Mono.just(employeee);
	}
	
	@GetMapping("/users")
	public Flux<Employee> getAll(){
		return employeeRepository.findAll();
	}
}
