package com.mathenge.controllers;

import com.mathenge.model.Task;
import com.mathenge.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Mathenge on 5/8/2017.
 */

@RestController
public class SampleRestController {

    @Autowired
    private TaskService taskService;

    /*@RequestMapping("/tasks")
    public String allTasks() {
        return taskService.findAll().toString();
    }

    @RequestMapping("/save-task")
    public String saveTask(@RequestParam String name, @RequestParam String desc) {
        Task task = new Task(name, desc, new Date(),false);
        taskService.save(task);
        return "Task Saved!";
    }

    @RequestMapping("/delete-task")
    public String deleteTask(@RequestParam int id) {
        taskService.delete(id);
        return "Task Deleted!";
    }*/
}
