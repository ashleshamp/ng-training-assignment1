package com.app.service;

import java.util.List;

import com.app.pojos.Task;

public interface TaskServiceInterface {

	String addnewTask(Task newtask);

	List<Task> getAllTask(Task newtask);

	String updateTask(Task newtask, Long taskId);

	String deleteTask(Long taskId);

}
