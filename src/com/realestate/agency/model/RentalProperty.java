package com.realestate.agency.model;

public class RentalProperty extends Property{

	private String nameOfTenant;
	private String tenantPhoneNumber;
	
	
	public String getNameOfTenant() {
		return nameOfTenant;
	}
	public void setNameOfTenant(String nameOfTenant) {
		this.nameOfTenant = nameOfTenant;
	}
	public String getTenantPhoneNumber() {
		return tenantPhoneNumber;
	}
	public void setTenantPhoneNumber(String tenantPhoneNumber) {
		this.tenantPhoneNumber = tenantPhoneNumber;
	}
	
	
}
