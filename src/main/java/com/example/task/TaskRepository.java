package com.example.task;

import org.springframework.data.repository.CrudRepository;
import com.example.task.Task;
import javax.persistence.criteria.CriteriaBuilder;

// This will be AUTO IMPLEMENTED by Spring into a Bean called taskRepository in the controller
// CRUD refers Create, Read, Update, Delete

public interface TaskRepository extends CrudRepository <Task, Integer> {

}
