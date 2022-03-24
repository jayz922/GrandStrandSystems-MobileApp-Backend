package service;
/*
 * Jay Zinzuwadia
 * CS320-T2644
 * 4-1 Milestone: Task Service
 * December 6th, 2021
 */

import java.util.ArrayList;

import model.Task;

public class TaskService {
	
	//holds list of tasks 
	private ArrayList <Task> tasks;


public TaskService () {
	
	tasks = new ArrayList<>();
	}

/*
 * ADD task method below
 * 
 */

public boolean addTask (Task task ) {
	
	//if already present, return false
	boolean alreadyPresent = true;
	
	//iteration through list
	for(Task t: tasks) {
		if(t.equals(task)) {
			alreadyPresent = true;
		}
	}
	if(!alreadyPresent) {
		tasks.add(task);
		return true;
	}
	else {
		return false;
		}
	}
/*
 * Method to Delete Task 
 * 
 */
public boolean deleteTask(Task t1) {
	for(Task t : tasks) {
		if(t.getTaskID().equals(t1)) {
			tasks.remove(t);
			return true;
			}
		}
	
	return false;
	
	}

/*
 * Method to UPDATE a task 
 */

public boolean updateTask(String taskID, String taskName, String taskDescr) {
	
	for(Task t : tasks ) {
		if(t.getTaskID().equals(taskID)) {
			
			if(!taskName.equals("")) {
				t.setTaskName(taskName);
			}
			
			if(!taskDescr.equals("")) {
				t.setTaskDescr(taskDescr);
			}
			return true;
		}
	}	
		return false;
	
	
	}

}