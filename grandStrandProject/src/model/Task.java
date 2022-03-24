package model;
/*
 * Jay Zinzuwadia
 * CS320-T2644
 * 4-1 Milestone: Task Service
 * December 6th, 2021
 */

public class Task {
	
	//member variables
	private String taskID;
	private String taskName;
	private String taskDescr;
	
	//parameterized construct for both variables
	public Task (String taskID, String taskName, String taskDescr) {
		//set bounds for 10 length
		if(taskID.length() <=10 && taskID.length() !=0) {
			
			this.taskID = taskID;
		}
		//set bounds for 20 length
		if(taskName.length() <=20 && taskName.length() !=0) {
			
			this.taskName = taskName;
		}
		//set bounds for 50 length
		if(taskDescr.length() <=50 && taskDescr.length() !=0) {
		
			this.taskDescr = taskDescr;
		}
	}

	//Setter and getter methods for all variables
	
	public String getTaskID () {
		
		return taskID;
	}
	
	public void setTaskID(String taskID) {
		
		this.taskID = taskID;
	}
	
	public String getTaskName () {
		
		return taskName;
	}
	
	public void setTaskName (String taskName) {
		
		this.taskName = taskName;
	}
	
	public String getTaskDescr () {
		
		return taskDescr;
	}
	
	public void setTaskDescr (String taskDescr) {
		
		this.taskDescr = taskDescr;
	}
	
	//Method to check identical tasks
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
		
		Task duplicate = (Task) same;
		
		//conditions for taskID
		if(taskID == null) {
			if(duplicate.taskID != null) {
				return false;
			}
		}
		else if (!taskID.equals(duplicate.taskID)) {
			return false;
		}
		
		//conditions for taskName
		if(taskName == null) {
			if(duplicate.taskName != null) {
				return false;
			}
		}
		else if (!taskName.equals(duplicate.taskName)) {
			return false;
		}
		
		//conditions for taskDescr
		if(taskDescr == null) {
			if(duplicate.taskDescr != null) {
				return false;
			}
		}
		else if (!taskDescr.equals(duplicate.taskDescr)) {
			return false;
		}
		return false;
		
	}
}
