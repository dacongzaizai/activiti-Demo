package com.example;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;

public class OverTest {

	private static ProcessEngine  processEngine =ProcessEngines.getDefaultProcessEngine();

	public static void main(String[] args) {
		processEngine.getTaskService().complete("2508");
	
	}
	
}
