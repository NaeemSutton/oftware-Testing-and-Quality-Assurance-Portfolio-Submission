package com.taskservice;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TaskService {
    final Map<String, Task> taskMap = new HashMap<>();

    public void addTask(String name, String description) {
        String uniqueID = UUID.randomUUID().toString().substring(0, 10);
        Task newTask = new Task(uniqueID, name, description);
        taskMap.put(uniqueID, newTask);
    }

    public void deleteTask(String taskId) {
        if (!taskMap.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found");
        }
        taskMap.remove(taskId);
    }

    public void updateTaskName(String taskId, String newName) {
        if (!taskMap.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found");
        }
        taskMap.get(taskId).setName(newName);
    }

    public void updateTaskDescription(String taskId, String newDescription) {
        if (!taskMap.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found");
        }
        taskMap.get(taskId).setDescription(newDescription);
    }
}
