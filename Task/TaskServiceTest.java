package com.taskservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    @Test
    void testAddTask() {
        TaskService service = new TaskService();
        service.addTask("Task Name", "Task Description");
        assertFalse(service.taskMap.isEmpty());
    }

    @Test
    void testDeleteTask() {
        TaskService service = new TaskService();
        service.addTask("Task Name", "Task Description");
        String taskId = service.taskMap.keySet().iterator().next();
        service.deleteTask(taskId);
        assertFalse(service.taskMap.containsKey(taskId));
    }

    @Test
    void testUpdateTaskName() {
        TaskService service = new TaskService();
        service.addTask("Old Name", "Task Description");
        String taskId = service.taskMap.keySet().iterator().next();
        service.updateTaskName(taskId, "New Name");
        assertEquals("New Name", service.taskMap.get(taskId).getName());
    }

    @Test
    void testUpdateTaskDescription() {
        TaskService service = new TaskService();
        service.addTask("Task Name", "Old Description");
        String taskId = service.taskMap.keySet().iterator().next();
        service.updateTaskDescription(taskId, "New Description");
        assertEquals("New Description", service.taskMap.get(taskId).getDescription());
    }
}
