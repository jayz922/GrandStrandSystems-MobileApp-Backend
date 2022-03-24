package model;
/*
 * Name: Jay Zinzuwadia
 * Class: CS320-T2644
 * Assignment: 3-2 Milestone Contact Service 
 * Date: December 6th, 2021
 */
public class Contact {
	
	//Member Variables
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String contactAddress;
	
	//Parameterized constructors for each variable above
	
	public Contact (String contactID, String firstName, String lastName, String phoneNumber, String contactAddress) {
		
		//first four variables have bounds of 10 max in length and address has 30 max
		if(contactID.length() <= 10 && contactID.length() != 0) {
			
			this.contactID = contactID;
		}
		
		if(firstName.length() <= 10 && firstName.length() != 0) {
			
			this.firstName = firstName;
		}
		
		if(lastName.length() <= 10 && lastName.length() != 0) {
			
			this.lastName = lastName;
		}
		
		if(phoneNumber.length() <= 10 && phoneNumber.length() != 0) {
			
			this.phoneNumber = phoneNumber;
		}
		
		if(contactAddress.length() <= 30 && contactAddress.length() != 0) {
			
			this.contactAddress = contactAddress;
		}	
		
		
	}
	
	//Setter and Getter Methods for all variables 
	
	
	public String getContactID () {
		
		return contactID;
	}
	
	public void setContactID (String contactID) {
		
		this.contactID = contactID;
	}

	public String getFirstName () {
		
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	
	public String getLastName () {
		
		return lastName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		
		return phoneNumber;
	}
	
	public void setPhoneNumber (String phoneNumber) {
		
		this.phoneNumber = phoneNumber;
	}
	
	public String getContactAddress() {
		
		return contactAddress;
	}
	
	public void setContactAddress (String contactAddress) {
		
		this.contactAddress = contactAddress;
	}
	
	//Method to check identical contact's 
	@Override
	public boolean equals (Object same) {
		
		if(this == same) {
			return true;
		}
		if(same == null) {
			return false;
		}
		if(getClass() != same.getClass()) {
			return false;
		}
		
		Contact duplicate = (Contact) same;
		
		//conditions for contactID
		if(contactID == null) {
			if(duplicate.contactID != null) {
				
				return false;
			}	
		}
		else if (!contactID.equals(duplicate.contactID)) {
			return false;
		}
		
		//conditions for firstName variable 
		if(firstName == null) {
			if(duplicate.firstName != null) {
				
				return false;
			}
		}
		else if (!firstName.equals(duplicate.firstName)) {
			return false;
		}
		
		
		//conditions for lastName variable
		if(lastName == null) {
			if(duplicate.lastName != null) {
				
				return false;
			}
		}
		else if (!lastName.equals(duplicate.lastName)) {
			return false;
		}
		
		
		//conditions for phoneNumber variable
		if(phoneNumber == null) {
			if(duplicate.phoneNumber != null) {
				
				return false;
			}
		}
		else if (!phoneNumber.equals(duplicate.phoneNumber)) {
			return false;
		}
		
		//conditions for contactAddress variable
		if(contactAddress == null) {
			if(duplicate.contactAddress != null) {
				
				return false;
			}
				
		}
		else if (!contactAddress.equals(duplicate.contactAddress)) {
			return false;
		}
		return false;
		
	}
	
}
	
	
	
	
	
	
	
	
