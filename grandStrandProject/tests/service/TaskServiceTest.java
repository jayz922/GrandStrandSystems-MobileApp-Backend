package service;

/*
 * Jay Zinzuwadia
 * CS320-T2644
 * 4-1 Milestone: Task Service
 * December 6th, 2021
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;



public class TaskServiceTest {
	
//Test the addition a task 
	@Test	
	public void testAddTask() {
	
		TaskService ts = new TaskService();
	
		Task t1 = new Task("A001", "Chores", "Wash the dishes");
		assertEquals(true, ts.addTask(t1));
	
	}

	//test delete method
	
	@Test
	public void testDeleteTask() {
		
		TaskService ts = new TaskService();
		
		//new tasks for testing
		Task t1 = new Task("A001", "Chores", "Wash the dishes");
		Task t2 = new Task("A002", "Errands", "Drop package off to USPS");
		
		//add the tasks using add method
		ts.deleteTask(t1);
		ts.deleteTask(t2);
		
		//JUNIT testing via assertEquals
		assertEquals(false, ts.deleteTask(t1));
		assertEquals(false, ts.deleteTask(t2));
	}

	@Test
	public void testUpdateTask() {
		
		
		TaskService ts = new TaskService();
		
		//new tasks for testing
		Task t1 = new Task("A001", "Chores", "Wash the dishes");
		Task t2 = new Task("A002", "Errands", "Drop package off to USPS");
		
		//add tasks for testing
		ts.addTask(t1);
		ts.addTask(t2);
		
		//JUNIT tests via assertEquals
		assertEquals(false, ts.updateTask("B001", "ChoresChanged" ,"DishesChanged"));
		assertEquals(false,ts.updateTask("B002", "ErrandsChange", "PackageChanged"));
	}





	
}
