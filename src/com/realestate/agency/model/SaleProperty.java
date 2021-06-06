package com.realestate.agency.model;

public class SaleProperty extends Property{

	//fields
	private double amountOfSale;
	private double areaOfTheBuilding;
	
	//the methods that perform the actions
	public double getAmountOfSale() {
		return amountOfSale;
	}
	
	public void setAmountOfSale(double amountOfSale) {
		this.amountOfSale = amountOfSale;
	}
	public double getAreaOfTheBuilding() {
		return areaOfTheBuilding;
	}
	public void setAreaOfTheBuilding(double areaOfTheBuilding) {
		this.areaOfTheBuilding = areaOfTheBuilding;
	}
	
	
	
}
