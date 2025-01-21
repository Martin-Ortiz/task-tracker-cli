package com.martinoddev.model;

public class Input {
	private String command;
	private String task;
	private Integer idTask;
	private String status;
		
	public Input() {}

	public Input(String command, String task, Integer idTask, String status) {
		super();
		this.command = command;
		this.task = task;
		this.idTask = idTask;
		this.status = status;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
