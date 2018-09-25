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
	    //��ʼ��23�ű�
		ProcessEngine  processEngine =ProcessEngines.getDefaultProcessEngine();
		//��������ʵ��
		Deployment deployment = processEngine.getRepositoryService()
				.createDeployment().name("Activiti ����2")
				.addClasspathResource("diagrams/test.bpmn")
				//.addClasspathResource("diagrams\test.png")
				.deploy();
		System.out.println("����ID��"+deployment.getId());
		System.out.println("�������ƣ�"+deployment.getName());
		
		ProcessInstance processinstance =processEngine.getRuntimeService().startProcessInstanceByKey("HelloWorld");
		
		System.out.println("����ʵ��ID��"+processinstance.getId());
		System.out.println("����ʵ��ID��"+processinstance.getProcessDefinitionId());
		
		
		
	}

}
