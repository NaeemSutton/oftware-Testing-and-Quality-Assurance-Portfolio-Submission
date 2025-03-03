package com.taskservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testTaskCreationValid() {
        Task task = new Task("1234567890", "Test Task", "This is a test description.");
        assertEquals("1234567890", task.getTaskId());
        assertEquals("Test Task", task.getName());
        assertEquals("This is a test description.", task.getDescription());
    }

    @Test
    void testInvalidTaskId() {
        assertThrows(IllegalArgumentException.class, () -> new Task(null, "Valid Name", "Valid Description"));
        assertThrows(IllegalArgumentException.class, () -> new Task("12345678901", "Valid Name", "Valid Description"));
    }

    @Test
    void testSetName() {
        Task task = new Task("1234567890", "Test Task", "Test Description");
        task.setName("New Name");
        assertEquals("New Name", task.getName());
    }

    @Test
    void testSetDescription() {
        Task task = new Task("1234567890", "Test Task", "Test Description");
        task.setDescription("Updated Description");
        assertEquals("Updated Description", task.getDescription());
    }
}

