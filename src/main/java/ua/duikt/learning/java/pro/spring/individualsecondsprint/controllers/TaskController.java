package ua.duikt.learning.java.pro.spring.individualsecondsprint.controllers;

import ua.duikt.learning.java.pro.spring.individualsecondsprint.services.TaskService;

/**
 * Created by Mykyta Sirobaba on 20.01.2026.
 * email mykyta.sirobaba@gmail.com
 */
// TODO: Add the @RestController and @RequestMapping("/tasks") annotations
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // TODO: Implement GET, POST, PUT, and DELETE methods
}

