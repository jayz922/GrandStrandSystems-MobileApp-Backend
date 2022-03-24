package service;
/*
 * Name: Jay Zinzuwadia
 * Class: CS320-T2644
 * Assignment: 3-2 Milestone Contact Service 
 * Date: December 6th, 2021
 */



import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import model.Contact;


public class ContactServiceTest {
	
	//below tests the addition of a contact
	@Test
	public void testAdd() {
		
		ContactService cs = new ContactService();
		
		Contact c1 = new Contact("C001", "Jim", "Smith", "000-000-0000", "123 F Avenue");
		assertEquals(true, cs.add(c1));
	}
	
	//test the delete methods
	@Test
	public void testDelete() {
		
		ContactService cs = new ContactService(); 
		//create the new contacts
		Contact c1 = new Contact("C001", "Jim", "Smith", "000-000-0000", "123 F Avenue");
		Contact c2 = new Contact("C002", "Bill", "Warner", "123-456-7890", "111 G Street");
		Contact c3 = new Contact("C003", "Scott", "Thompson", "000-111-1234", "123 Alpha Pkwy");
		//add the contacts using add method referenced in "ContactService.java"
		cs.delete(c1);
		cs.delete(c2);
		cs.delete(c3);
		
		//use assertEquals Test via JUNIT
		assertEquals (false, cs.delete(c1));
		assertEquals (false, cs.delete(c2));
		assertEquals (false, cs.delete(c3));
		
	}
	
	//Test the update method
	@Test
	public void testUpdate() {
		
		ContactService cs = new ContactService();
		
		Contact c1 = new Contact("C001", "Jim", "Smith", "000-000-0000", "123 F Avenue");
		Contact c2 = new Contact("C002", "Bill", "Warner", "123-456-7890", "111 G Street");
		Contact c3 = new Contact("C003", "Scott", "Thompson", "000-111-1234", "123 Alpha Pkwy");
		
		cs.add(c1);
		cs.add(c2);
		cs.add(c3);
		
		assertEquals(false, cs.update("T002", "BillChange", "WarnerChange", "111-222-3333", "222 G Street"));
		assertEquals(false, cs.update("C005", "ScottChange", "ThompsonChange", "012-345-7777", "444 Beta Pkwy"));
		
		}
	}

