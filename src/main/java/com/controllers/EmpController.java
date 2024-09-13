package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.EmpDto;
import com.model.CustData;
import com.service.EmpService;

@RestController
public class EmpController {

	@Autowired

	EmpService empService;

	@PostMapping("/saveemp")
	public EmpDto saveemployee(@RequestBody EmpDto empdto) {
		EmpDto x = empService.saveemployee(empdto);
		return x;
	}

	@GetMapping("/getemp")
	public EmpDto getemployee(@RequestParam("id") Integer id) {
		return empService.getemployee(id);
		
	}

	@PutMapping("/updateemp/{id}")
	public void updateemployee(@RequestBody EmpDto empdto, @PathVariable("id") Integer id) {
		empService.updateemployee(empdto, id);
	}

	@DeleteMapping("/deleteemp/{id}")
	public void deleteemployee(@PathVariable("id") Integer id) {
		empService.deleteemployee(id);
	}

	@GetMapping("/empnamebyid/{id}")
	public String getNameById(@PathVariable("id") Integer id) {
		return empService.getNameById(id);
	}

	@GetMapping("/empnames")
	public List<String> getNames() {
		return empService.getNames();
	}

	@GetMapping("/empmailbyid/{id}")
	public String getMailById(@PathVariable("id") Integer id) {
		return empService.getMailById(id);
	}

	@GetMapping("/empmails")
	public List<String> getMails() {
		return empService.getMails();
	}

	public int add(int x, int y) {
		int z = x + y;
		return z;
	}

	public void getEmp(EmpDto empdto) {
		System.out.println(empdto.getMail());

	}
	
	@GetMapping("/getcustdetails")
	public List<CustData> findOrdersWithCustomerDetails() {
		return empService.findOrdersWithCustomerDetails();
	}
}
