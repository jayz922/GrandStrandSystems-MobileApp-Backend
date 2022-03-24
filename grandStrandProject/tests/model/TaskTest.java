package model;
/*
 * Jay Zinzuwadia
 * CS320-T2644
 * 4-1 Milestone: Task Service
 * December 6th, 2021
 */

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskTest {
	
//Test for set and get taskID
	@Test
	public void getTaskIDTest() {
	
	Task task = new Task("A001" , "Send Email", "Confirm availability for appt");
	assertEquals("A001", task.getTaskID());
	
}

	@Test
	public void setTaskIDTest() {
		
		Task task = new Task("A001" , "Send Email", "Confirm availability for appt");
		String id = "A002";
		task.setTaskID(id);
		assertEquals(id, task.getTaskID());
		
	}

	
//Test for set and get taskName
	@Test
	public void getTaskNameTest() {
	
	Task task = new Task("A001" , "Send Email", "Confirm availability for appt");
	assertEquals("Send Email", task.getTaskName());
	
}

	@Test
	public void setTaskNameTest() {
		
		Task task = new Task("A001" , "Send Email", "Confirm availability for appt");
		String name = "Workout";
		task.setTaskName(name);
		assertEquals(name, task.getTaskName());
		
	}	
	
//Test for set and get of taskDescr
	
	@Test
	public void getTaskDescrTest() {
	
	Task task = new Task("A001" , "Send Email", "Confirm availability for appt");
	assertEquals("Confirm availability for appt", task.getTaskDescr());
}

	@Test
	public void setTaskDescrTest() {
		
		Task task = new Task("A001" , "Send Email", "Confirm availability for appt");
		String description = "Train for marathon";
		task.setTaskDescr(description);
		assertEquals(description, task.getTaskDescr());
		
	}
	
	//Testing for identical tasks
	@Test
	public void identicalTaskTest() {
		
		Task firstTask = new Task("A001" , "Send Email", "Confirm availability for appt");
		Task secondTask = new Task("A001" , "Send Email", "Confirm availability for appt");
		
		assertEquals(false, firstTask.equals(secondTask));
	}

}
