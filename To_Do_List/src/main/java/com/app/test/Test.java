package com.app.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Task;
import com.app.service.TaskServiceImpl;

@SpringBootTest
class TaskServiceTest {

    @Autowired
    private TaskServiceImpl taskService;

    @Test
    void testAddTask() {
        Task task = new Task(null, "Test", "JUnit test", false);
        String saved = taskService.addnewTask(task);
        
    }
}