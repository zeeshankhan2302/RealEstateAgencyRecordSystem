package com.realestate.agency.model;

//class that all types of properties inherit
public abstract class Property {

	//fields
	protected String streetAddress;
	protected String surbub;
	protected String uniquePropertyCode;
	protected String propertyOwnerCode;
	protected int isPropertyForSaleorLeased;
	
	//methods that control the operation of property
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getSurbub() {
		return surbub;
	}
	public void setSurbub(String surbub) {
		this.surbub = surbub;
	}
	public String getUniquePropertyCode() {
		return uniquePropertyCode;
	}
	public void setUniquePropertyCode(String uniquePropertyCode) {
		this.uniquePropertyCode = uniquePropertyCode;
	}
	public String getPropertyOwnerCode() {
		return propertyOwnerCode;
	}
	public void setPropertyOwnerCode(String propertyOwnerCode) {
		this.propertyOwnerCode = propertyOwnerCode;
	}
	public int isPropertyForSaleorLeased() {
		return isPropertyForSaleorLeased;
	}
	public void setPropertyForSaleorLeased(int isPropertyForSaleorLeased) {
		this.isPropertyForSaleorLeased = isPropertyForSaleorLeased;
	}	
	
}
