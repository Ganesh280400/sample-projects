package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.CustData;

@Repository
public interface CustRepo extends JpaRepository<CustData, Integer>{
	
	@Query("SELECT new com.model.CustData(c.id, c.name, c.mail, o.id, o.orderdesc) " +
	           "FROM cust c INNER JOIN ordtab o ON c.id = o.custId " +
	           "WHERE c.id = :custId")
	 public List<CustData> findOrdersWithCustomerDetails();

}
