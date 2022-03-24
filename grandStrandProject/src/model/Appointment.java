package model;
/*
 * Jay Zinzuwadia
 * CS320-T2644
 * 4-1 Milestone: Appointment Service
 * December 6th, 2021
 */

import java.util.Date;
//
public class Appointment {
	
	//variables
	private String apptID;
	private Date apptDate;
	private String apptDescr;
	
	//date object
	Date currentDate = new Date();
	
	//parameterized construct for variables
	public Appointment(String apptID, Date apptDate, String apptDescr) {
		
		//create current date object
		Date currentDate = new Date();
		
		if(apptID.length() !=0 && apptID.length() <=10 ) {
			
			this.apptID = apptID;
		}
		
		if(apptDate != null && currentDate.before(apptDate)) {
			
			this.apptDate = apptDate;
		}
		
		if(apptDescr.length() !=0 && apptDescr.length() <= 50) {
			
			this.apptDescr = apptDescr;
		}
	}
		
	//setter and getter methods
	public String getApptID () {
		
		return apptID;
	}
	
	public void setApptID (String apptID) {
		
		this.apptID = apptID;
	}
	
	public Date getApptDate () {
		
		return apptDate;
	}
	
	public void setApptDate (Date apptDate) {
		
		this.apptDate = apptDate;
	}
	
	public String getApptDescr () {
		
		return apptDescr;
	}
	
	public void setApptDescr (String apptDescr) {
		
		this.apptDescr = apptDescr;
	}
}
	



