package com.martinoddev.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.martinoddev.model.Task;

public class Util {
	
	private Util() {}
	
	public static String getDateTime(LocalDateTime date) {
		
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        return date.format(formato);
	}
	
	public static void list(Map<Integer, Task> tasks) {
		List<Task> todoList = getList(tasks, Const.ALL);
		
		System.out.println(Const.ID + " | " + Const.TASK + " | " + Const.STATUS + " | " + Const.CREATED_AT + " | " + Const.UPDATED_AT );
		for(Task task : todoList) {
			System.out.println(task.getId() + " " +task.getTask() + " " + task.getStatus() + " " + task.getCreatedAt() + " " + task.getUpdatedAt()); 
			
		}
		
	}
	
	private static List<Task> getList(Map<Integer, Task> tasks, String type){
		
		List<Task> result = new ArrayList<>();
		
		if(!type.equals(Const.ALL)) {
			for (Task task : tasks.values()) {
	            if (task.getStatus().equals(type)) {
	                result.add(task);
	            }
	        }
		}else {
			for (Task task : tasks.values()) {
				result.add(task);
	        }
		}
        

        return result;
	}
	
	public static String getCommand(String input) {
		
	    String[] strings = input.split(" ");
	    String firstCommand = strings[0];
	    String secondCommand = (strings.length > 1) ? strings[1] : "";

	    if (CliCommands.ID_COMMANDS.containsKey(firstCommand)) {
	 
	        if (strings.length > 1 && CliCommands.ID_COMMANDS.containsKey(firstCommand + " " + secondCommand)) {
	            return firstCommand + " " + secondCommand;
	        }
	        
	        return firstCommand;
	    }

	    return firstCommand;
	}

}
