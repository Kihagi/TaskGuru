package com.mathenge.services;

import com.mathenge.dao.TaskRepository;
import com.mathenge.model.Task;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mathenge on 5/8/2017.
 */

@Service
@Transactional
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        List<Task> tasks = new ArrayList<>();
        for (Task task : taskRepository.findAll()) {
            tasks.add(task);
        }
        return tasks;
    }

    public Task findTask(int id) {
        return taskRepository.findOne(id);
    }

    public void save(Task task) {
        taskRepository.save(task);
    }

    public void delete(int id) {
        taskRepository.delete(id);
    }
}
