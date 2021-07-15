package com.example.task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String task;

    private String assignedTo;

    private String dueDate; //unclear if this is the correct date format (sql)


    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {

        this.dueDate = dueDate;
    }

   @Override
    public String toString() {
        return "Task{" +
                "task='" + task + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", dueDate=" + dueDate +
                ", id=" + id +
                '}';
    }


}
