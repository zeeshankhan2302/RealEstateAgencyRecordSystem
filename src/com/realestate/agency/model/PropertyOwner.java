package com.realestate.agency.model;

/*The class that all property salers and landlords inherit from*/

public abstract class PropertyOwner {

	//fields of the property owner class
	protected String ownerName;
	protected String ownerAddress;
	protected String ownerId;
	protected int sellerOrLandLord;
	
	
	
	/*methods ,setters and getters that control the functionality of the 
	 * property owner
	 */
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public int isSellerOrLandLord() {
		return sellerOrLandLord;
	}
	public void setSellerOrLandLord(int sellerOrLandLord) {
		this.sellerOrLandLord = sellerOrLandLord;
	}
	
	
	
}
