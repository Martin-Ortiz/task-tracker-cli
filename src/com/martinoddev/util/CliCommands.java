package com.martinoddev.util;

import java.util.HashMap;
import java.util.Map;

public class CliCommands {
	private CliCommands() {};
	
	public static final Map<String, Integer> ID_COMMANDS = new HashMap<>();
	
	static {
		ID_COMMANDS.put("info", 0);
		ID_COMMANDS.put("add", 1);
		ID_COMMANDS.put("update", 2);
		ID_COMMANDS.put("delete", 3);
		ID_COMMANDS.put("mark-in-progress", 4);
		ID_COMMANDS.put("mark-done", 5);
		ID_COMMANDS.put("list", 6);
		ID_COMMANDS.put("list done", 7);
		ID_COMMANDS.put("list todo", 8);
		ID_COMMANDS.put("list in-progress", 9);
		ID_COMMANDS.put("exit", 10);
	}
}
