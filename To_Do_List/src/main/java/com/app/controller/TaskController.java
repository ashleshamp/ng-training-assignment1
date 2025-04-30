package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Task;
import com.app.service.TaskServiceInterface;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskServiceInterface taskServiceInterface;

	@PostMapping // insert
	public String addNewTask(Task newtask) {
		System.out.println("in add task  " + getClass());
		return taskServiceInterface.addnewTask(newtask) + " task added";
	}

	@GetMapping
	public List<Task> getAllTask(Task newtask) {
		System.out.println("in get all task" + getClass());
		return taskServiceInterface.getAllTask(newtask);
	}

	@PutMapping("/{taskId}")
	public String updateTask(Long taskId, Task newtask) {
		System.out.println("in update task" + getClass());
		return taskServiceInterface.updateTask(newtask, taskId);
	}

	@DeleteMapping("/{taskId}")
	public String deleteTask(Long taskId) {
		System.out.println("in delete task" + getClass());
		return taskServiceInterface.deleteTask(taskId);
	}
}
