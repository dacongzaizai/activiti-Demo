package com.example;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.task.Task;

public class QueryTest {
	
	private static ProcessEngine  processEngine =ProcessEngines.getDefaultProcessEngine();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Task> list = processEngine.getTaskService().createTaskQuery()
				.taskAssignee("����").list();
		if(list !=null && list.size()>0) {
			
			for(Task l :list) {
				System.out.println("����ID��"+l.getId());
				System.out.println("�������ƣ�"+l.getName());
				System.out.println("���񴴽�ʱ�䣺"+l.getCreateTime());
				System.out.println("�����ˣ�"+l.getAssignee());
				
			}
		}
		

	}

}
