package com.ssd;

public class Student {
	
	private Long id;
	private String name;
	private String address;
	private Long  mobileNo;


	
	
	public String getAddress() {
		return address;
	}


	public Long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
