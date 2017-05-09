package com.mathenge.dao;

import com.mathenge.model.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Mathenge on 5/8/2017.
 */
public interface TaskRepository extends CrudRepository<Task, Integer> {
}
