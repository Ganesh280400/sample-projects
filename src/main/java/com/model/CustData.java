package com.model;

public class CustData {

	int id;
	String name;
	String mail;
	int custid;
	String orderdesc;

	public CustData(int id, String name, String mail, int custid, String orderdesc) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.custid = custid;
		this.orderdesc = orderdesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getOrderdesc() {
		return orderdesc;
	}

	public void setOrderdesc(String orderdesc) {
		this.orderdesc = orderdesc;
	}

}
