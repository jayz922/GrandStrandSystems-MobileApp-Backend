package service;
/*
 * Jay Zinzuwadia
 * CS320-T2644
 * 4-1 Milestone: Appointment Service
 * December 6th, 2021
 */

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import model.Appointment;

public class AppointmentServiceTest {

	//Test the addition of a new appointment
	@Test
	public void testAddAppt () {
		
		AppointmentService as = new AppointmentService();
		
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureTime = new Date(currentDate.getTime() +10);
		
		Appointment a1 = new Appointment("111", futureTime, "Wheel Align");
		
		//add the appt
		as.addAppointment(a1);
		
		//test
		assertEquals(false, as.addAppointment(a1));
		
		
	}
	
	@Test
	public void testDeleteAppointment() {
		
		AppointmentService as = new AppointmentService();
		
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureTime = new Date(currentDate.getTime() +10);
		
		//new tasks for testing
		Appointment a1 = new Appointment("222", futureTime, "Description2");
		
		//add the tasks using add method
		as.deleteAppointment(a1);
		
		//JUNIT testing via assertEquals
		assertEquals(false, as.deleteAppointment(a1));
		
	}
}
