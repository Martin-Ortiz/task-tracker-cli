package com.martinoddev.model;

import java.time.LocalDateTime;

import com.martinoddev.util.Util;

public class Task {
	
	private Integer id;
	private String task;
	private String status;
	private String createdAt;
	private String updatedAt;
	
	
	public Task(Integer id, String task, String status) {
		this.id = id;
		this.task = task;
		this.status = status;
		this.createdAt = Util.getDateTime(LocalDateTime.now());
		this.updatedAt = Util.getDateTime(LocalDateTime.now());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt() {
		this.updatedAt = Util.getDateTime(LocalDateTime.now());
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
