package model;
/*
 * Name: Jay Zinzuwadia
 * Class: CS320-T2644
 * Assignment: 3-2 Milestone Contact Service 
 * Date: December 6th, 2021
 */




import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class ContactTest {
	
  /*
   * Test for get and set contactID
   */
  @Test
  public void getContactIDTest() {
    
    Contact contact = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
    assertEquals( "001", contact.getContactID());
  }
  
  @Test
  public void setContactIDTest() {
    
    Contact contact = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST"); //this right here 
    String id = "005";
    contact.setContactID(id);
    assertEquals(id, contact.getContactID());
  }
  /*
   * Test for get and set firstName
   */
  @Test
  public void getFirstNameTest () {
	  
	  Contact contact = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
	  
	  assertEquals("Bill", contact.getFirstName());
	  
  }
  
  @Test
  public void setFirstNameTest () {
	  
	  Contact contact = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
	  String firstName = "Bill";
	  contact.setFirstName(firstName);
	  assertEquals(firstName, contact.getFirstName());
  }
  /*
   * Test for get and set lastName
   */
  @Test
  public void getLastNameTest () {
	  
	  Contact contact = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
	  
	  assertEquals("Nash", contact.getLastName());
	  
  }
  
  @Test
  public void setLastNameTest () {
	  
	  Contact contact = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
	  String lastName = "Nash";
	  contact.setLastName(lastName);
	  assertEquals(lastName, contact.getLastName());
  }
  
  /*
   * Test for get and set phoneNum
   */
  @Test
  public void getPhoneNumTest () {
	  
	  Contact contact = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
	  
	  assertEquals("000-111-2222", contact.getPhoneNumber());
	  
  }
  
  @Test
  public void setPhoneNumberTest () {
	  
	  Contact contact = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
	  String phoneNum = "000-111-2222";
	  contact.setPhoneNumber(phoneNum);
	  assertEquals(phoneNum, contact.getPhoneNumber());
  }
  /*
   * Test for get and set of contactAddress
   */
  @Test
  public void getContactAddressTest () {
	  
	  Contact contact = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
	  
	  assertEquals("123 LA ST", contact.getContactAddress());
	  
  }
  
  @Test
  public void setContactAddressTest () {
	  
	  Contact contact = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
	  String contactAddress = "123 LA ST";
	  contact.setContactAddress(contactAddress);
	  assertEquals(contactAddress, contact.getContactAddress());
  }
  
  /* 
   * Test for override method test to check identical contacts
   * write another contact with the same info (2)
   * write the assertEquals test to see if both are identical 
   */
  
  @Test
  public void identicalContactTest () {
	  
	  Contact c1 = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
	  Contact c2 = new Contact ("001", "Bill", "Nash", "000-111-2222", "123 LA ST");
	  
	  assertEquals(false, c1.equals(c2));
	  
  }


  
  

}
