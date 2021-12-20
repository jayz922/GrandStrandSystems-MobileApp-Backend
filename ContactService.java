package service;
/*
 * Name: Jay Zinzuwadia
 * Class: CS320-T2644
 * Assignment: 3-2 Milestone Contact Service 
 * Date: December 6th, 2021
 */


import java.util.ArrayList;

import model.Contact;

public class ContactService {

	//holds the list of contact
	private ArrayList <Contact> contacts;


//default constructor
public ContactService() {
	
	contacts = new ArrayList<>(); 
	}


//method to ADD a contact to current list if not duplicate
public boolean add(Contact contact) {
	
	//if there is a contact already there, return false 
	boolean alreadyPresent = false;
	//iterate through contact list, if there is one already present, bool = true
	for(Contact c: contacts) {
		if(c.equals(contact)) {
			alreadyPresent = true;
		}
	}
	
	//if the contact is not present, add it and return true once successful
	if(!alreadyPresent) {
		contacts.add(contact);
		System.out.println("Contact has been added successfully");
		return true;
	}
	else {
		System.out.println("Contact already present");
		return false;
	}
}

//method to DELETE a contact given a contactID if currently present in the arrayList
public boolean delete(Contact c1) {
	for(Contact c : contacts) {
		if(c.getContactID().equals(c1)) {
			contacts.remove(c);
			System.out.println("Contact removed successfully");
			return true;
		}
	}
	
	//standard plan of action if above for loop not iterated and returns false
	System.out.println("Contact not present");
	return false; //could not have used else statement after if because nested inside braces the boolean condition wouldn't apply
}

/*Method to UPDATE the contact of the given contactID, if found updates firstName, lastName,
 * contactAddress. It will pass an empty string if a certain variable is not changed with modification/Update
 */

public boolean update(String contactID, String firstName, String lastName, String phoneNumber, String contactAddress) {
	
	for(Contact c : contacts) {
		if(c.getContactID().equals(contactID)) {
			if(!firstName.equals("")) {
				c.setFirstName(firstName);
			}
			if(!lastName.equals("")) {
				c.setLastName(lastName);
			}
			if(!phoneNumber.equals("")) {
				c.setPhoneNumber(phoneNumber);
			}
			if(!contactAddress.equals("")) {
				c.setContactAddress(contactAddress);
			}
			System.out.println("Contact Info updated successfully");
			return true;
				
		}
	}
	
	System.out.println("Contact not found");
	return false;
	
	}
}
	

