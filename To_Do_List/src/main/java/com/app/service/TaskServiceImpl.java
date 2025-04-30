package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.TaskDao;
import com.app.pojos.Task;

@Service
@Transactional
public class TaskServiceImpl implements TaskServiceInterface {

	@Autowired
	private TaskDao taskDao;

	@Override
	public String addnewTask(Task newtask) {

		System.out.println("In add new task");
		Task task = taskDao.save(newtask);
		return "new task added" + task.getTaskId();
	}

	@Override
	public List<Task> getAllTask(Task task) {

		return taskDao.findAll();
	}

	@Override
	public String updateTask(Task newtask, Long taskId) {

		if (taskDao.existsById(taskId)) {
			taskDao.save(newtask);
		}
		return "updated successfully";
	}

	@Override
	public String deleteTask(Long taskId) {

		if (taskDao.existsById(taskId)) {
			taskDao.deleteById(taskId);
		}
		return "deleted successfully";
	}

}
