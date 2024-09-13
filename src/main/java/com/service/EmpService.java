package com.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dto.EmpDto;
import com.model.CustData;

@Component
public interface EmpService {

	public EmpDto saveemployee(EmpDto empdto);

	public EmpDto getemployee(Integer id);

	public void updateemployee(EmpDto empdto, Integer id);

	public void deleteemployee(Integer id);

	public String getNameById(Integer id);

	public List<String> getNames();

	public String getMailById(Integer id);

	public List<String> getMails();

	public List<CustData> findOrdersWithCustomerDetails();

}
