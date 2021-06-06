package com.realestate.agency.model;

public class LandLord extends PropertyOwner{
	
	//specific properties that every landlord exhibits
	
	private String bankAccountDetail;
	private double amountOfRent;
	
	
	//methods ,setters and getters of the Landlord 
	public String getBankAccountDetail() {
		return bankAccountDetail;
	}
	public void setBankAccountDetail(String bankAccountDetail) {
		this.bankAccountDetail = bankAccountDetail;
	}
	public double getAmountOfRent() {
		return amountOfRent;
	}
	public void setAmountOfRent(double amountOfRent) {
		this.amountOfRent = amountOfRent;
	}
	
	

}
