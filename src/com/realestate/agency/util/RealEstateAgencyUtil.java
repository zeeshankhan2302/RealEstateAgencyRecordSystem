package com.realestate.agency.util;

import java.util.ArrayList;

import com.realestate.agency.AddNewLandLord;
import com.realestate.agency.AddNewPropertyForLease;
import com.realestate.agency.AddNewPropertyForSale;
import com.realestate.agency.AddNewSaler;
import com.realestate.agency.MenuFrame;
import com.realestate.agency.RealEstateAgencyRecordSystemWelcomeScreen;
import com.realestate.agency.model.LandLord;
import com.realestate.agency.model.RentalProperty;
import com.realestate.agency.model.SaleProperty;
import com.realestate.agency.model.Saler;


//A UTILITY CLASS THAT MANAGES THE OBJECTS OF THE APPLICATION AND ENSURES 
//THAT OBJECTS REQUIRED BY OTHER CLASSES ARE MANAGED IN CENTRAL PLACE FOR SYCHRONIZATION AND
//REDUCTION OF POSSIBLE UNINTENDED OVERIDES SINCE AT ANY MOMENT ONLY ONE INSTANCE CAN EXIST
public class RealEstateAgencyUtil {

	/*
	 * manage the instances of all the windows in one place; When we make instances
	 * private,we will have conroll since they will only be accessed from one place
	 * and hence only the same instance can be passed around as reference
	 */
	// from this class

	private static MenuFrame menuFrameInstance;
	private static AddNewSaler addNewSaler;
	private static AddNewLandLord addNewLandLord;
	private static AddNewPropertyForLease addNewPropertyForLease;
	private static AddNewPropertyForSale addNewPropertyForSale;
	private static RealEstateAgencyRecordSystemWelcomeScreen realEstateAgencyRecordSystemWelcomeScreen;

	
	//data structures to hold values temporarily before being stored in csv files
	
	private static ArrayList<LandLord>landLordList=new ArrayList<LandLord>();
	private static ArrayList<Saler>salerList=new ArrayList<Saler>();
	private static ArrayList<SaleProperty>salePropertyList=new ArrayList<SaleProperty>();
	private static ArrayList<RentalProperty>rentalPropertyList=new ArrayList<RentalProperty>();
	
	
	// make this public to allow the instance to be accessed from outside the class

	// even if the access is global throuth the public methods we have limited the
	// rights since access of fields is private
	public static MenuFrame menuFrameInstance() {

		if (menuFrameInstance == null) {
			menuFrameInstance = new MenuFrame();
		}
		return menuFrameInstance;
	}

	public static AddNewSaler addNewSalerInstance() {

		if (addNewSaler == null) {
			addNewSaler = new AddNewSaler();
		}

		return addNewSaler;
	}

	public static AddNewLandLord addNewLandLordInstance() {

		if (addNewLandLord == null) {
			addNewLandLord = new AddNewLandLord();
		}

		return addNewLandLord;
	}

	public static AddNewPropertyForLease addNewPropertyForLeaseInstance() {

		if (addNewPropertyForLease == null) {
			addNewPropertyForLease = new AddNewPropertyForLease();
		}
		return addNewPropertyForLease;
	}

	public static AddNewPropertyForSale addNewPropertyForSaleInstance() {
		
		if(addNewPropertyForSale==null) {
			addNewPropertyForSale=new AddNewPropertyForSale();
		}
		return addNewPropertyForSale;
	}
	
	public static RealEstateAgencyRecordSystemWelcomeScreen realEstateAgencyRecordSystemWelcomeScreenInstance() {
		
		if(realEstateAgencyRecordSystemWelcomeScreen==null) {
			realEstateAgencyRecordSystemWelcomeScreen=new RealEstateAgencyRecordSystemWelcomeScreen();
			
		}
		return realEstateAgencyRecordSystemWelcomeScreen;
	}

	public static ArrayList<LandLord> getLandLordList() {
		return landLordList;
	}

	public static void setLandLordList(ArrayList<LandLord> landLordList) {
		RealEstateAgencyUtil.landLordList = landLordList;
	}

	public static ArrayList<Saler> getSalerList() {
		return salerList;
	}

	public static void setSalerList(ArrayList<Saler> salerList) {
		RealEstateAgencyUtil.salerList = salerList;
	}

	public static ArrayList<SaleProperty> getSalePropertyList() {
		return salePropertyList;
	}

	public static void setSalePropertyList(ArrayList<SaleProperty> salePropertyList) {
		RealEstateAgencyUtil.salePropertyList = salePropertyList;
	}

	public static ArrayList<RentalProperty> getRentalPropertyList() {
		return rentalPropertyList;
	}

	public static void setRentalPropertyList(ArrayList<RentalProperty> rentalPropertyList) {
		RealEstateAgencyUtil.rentalPropertyList = rentalPropertyList;
	}
	
	
}
