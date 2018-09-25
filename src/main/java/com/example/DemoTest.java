package com.example;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //初始化23张表
		ProcessEngine  processEngine =ProcessEngines.getDefaultProcessEngine();
		//创建流程实例
		Deployment deployment = processEngine.getRepositoryService()
				.createDeployment().name("Activiti 入门2")
				.addClasspathResource("diagrams/test.bpmn")
				//.addClasspathResource("diagrams\test.png")
				.deploy();
		System.out.println("部署ID："+deployment.getId());
		System.out.println("部署名称："+deployment.getName());
		
		ProcessInstance processinstance =processEngine.getRuntimeService().startProcessInstanceByKey("HelloWorld");
		
		System.out.println("流程实例ID："+processinstance.getId());
		System.out.println("部署实例ID："+processinstance.getProcessDefinitionId());
		
		
		
	}

}
