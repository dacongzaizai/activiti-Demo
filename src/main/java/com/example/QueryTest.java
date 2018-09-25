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
				.taskAssignee("李四").list();
		if(list !=null && list.size()>0) {
			
			for(Task l :list) {
				System.out.println("任务ID："+l.getId());
				System.out.println("任务名称："+l.getName());
				System.out.println("任务创建时间："+l.getCreateTime());
				System.out.println("经办人："+l.getAssignee());
				
			}
		}
		

	}

}
