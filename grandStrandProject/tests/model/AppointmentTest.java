package model;
/*
 * Jay Zinzuwadia
 * CS320-T2644
 * 4-1 Milestone: Appointment Service
 * December 6th, 2021
 */

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;



public class AppointmentTest {
	
	

	@Test
	public void getApptIDTest () {
		
		//currentDate is equal to current system time matched by milliseconds 
		Date currentDate = new Date(System.currentTimeMillis());
				
		//future time object to compare that the time is indeed in the future
		Date futureTime = new Date(currentDate.getTime());
		
		Appointment appointment = new Appointment("123", futureTime, "Oil Change");
		
		assertEquals(true, appointment.getApptID().equals("123"));
		
		
	}
public void getApptDateTest() {
		
		//currentDate is equal to current system time matched by milliseconds 
		Date currentDate = new Date(System.currentTimeMillis());
				
		//future time object to compare that the time is indeed in the future
		Date futureTime = new Date(currentDate.getTime()-10);
		
		Appointment appointment = new Appointment("123", futureTime, "Oil Change");
	
		assertEquals(false, appointment.getApptDate() == futureTime);
		
		
	}
	
	
	@Test	
	public void getApptDescrTest () {
		
		//currentDate is equal to current system time matched by milliseconds 
		Date currentDate = new Date(System.currentTimeMillis());
				
		//future time object to compare that the time is indeed in the future
		Date futureTime = new Date(currentDate.getTime());
		
		Appointment appointment = new Appointment("123", futureTime, "Oil Change");
		
		assertEquals(true, appointment.getApptDescr().equals("Oil Change"));
		
		
	}
	
	
		
}
	
	
	

