package com.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.controllers.EmpController;
import com.dto.EmpDto;
import com.service.EmpService;

//MockitoExtension.class -- which help us to run a junit test cases

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class EmpControllerTest {

	@Test
	public void addTest() {
		EmpController obj = new EmpController();
		obj.add(5, 6);
	}

	@Test
	public void getEmpTest() {
		EmpController obj = new EmpController();

		EmpDto empdto = new EmpDto();
		empdto.setId(7);
		empdto.setEmpname("ganesh");
		empdto.setMail("gani@mail.com");

		obj.getEmp(empdto);
	}

	@BeforeAll
	public void setup() {
		MockitoAnnotations.openMocks(this);

	}

	@InjectMocks
	EmpController obj;

	@Mock
	private EmpService service;

	@Test
	public void saveemployeeTest() {

		EmpDto empdto = new EmpDto();
		empdto.setId(7);
		empdto.setEmpname("ganesh");
		empdto.setMail("gani@mail.com");

		when(service.saveemployee(empdto)).thenReturn(empdto);
		obj.saveemployee(empdto);

	}

	@Test
	public void getemployeeTest() {

		EmpDto empdto = new EmpDto();
		empdto.setId(7);
		empdto.setEmpname("ganesh");
		empdto.setMail("gani@mail.com");
		when(service.getemployee(1)).thenReturn(empdto);

		obj.getemployee(1);

	}

	@Test
	public void getNameByIdTest() {

		when(service.getNameById(1)).thenReturn("hello");

		obj.getNameById(1);

	}

	@Test
	public void getNamesTest() {

		when(service.getNames()).thenReturn(new ArrayList<String>());
		obj.getNames();
	}

	@Test
	public void getMailByIdTest() {

		when(service.getMailById(7)).thenReturn("sample@com.in");
		obj.getMailById(7);
	}

	@Test
	public void getMailsTest() {

		when(service.getMails()).thenReturn(new ArrayList<String>());
		obj.getMails();
	}

}
