package com.martinoddev.cli;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.martinoddev.model.Task;
import com.martinoddev.util.CliCommands;
import com.martinoddev.util.StatusTask;
import com.martinoddev.util.Util;

public class MyCLI {
    public static void main(String[] args) {
       Map<Integer, Task> tasks = new HashMap<>();
       Integer idCounter = 1;
       Scanner scanner = new Scanner(System.in);
       String input = "";
       String task = "";
       
       while(!input.equals("exit")) {
    	   System.out.print("task-cli ");
    	   input = scanner.nextLine().trim();
    	   
    	   
    	   
    	   if(CliCommands.ID_COMMANDS.containsKey(Util.getCommand(input))) {
    		   
    		   switch (CliCommands.ID_COMMANDS.get(input)) {
    		   	
				case 1:
					tasks.put(idCounter, new Task(idCounter, task, StatusTask.TODO));
					idCounter++;
					break;
				case 2:
									
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
						
					break;
				case 6:
					Util.list(tasks);
					break;
				case 7:
					
					break;
				case 8:
					
					break;
				case 9:
					
					break;
				case 0:
					break;
				}
    		   
    	   }else {
    		   System.out.println("'" + input + "' " + "not recognized as a command." );
    	   }
    	   System.out.println(input);
    	   
    	   
       }
       scanner.close();
       
    }
}
