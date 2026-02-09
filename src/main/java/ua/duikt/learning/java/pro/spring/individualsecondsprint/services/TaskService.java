package ua.duikt.learning.java.pro.spring.individualsecondsprint.services;

import org.springframework.stereotype.Service;
import ua.duikt.learning.java.pro.spring.individualsecondsprint.entities.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Mykyta Sirobaba on 20.01.2026.
 * email mykyta.sirobaba@gmail.com
 */
@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Task> getAllTasks() {
        // TODO: return the list of tasks
        return new ArrayList<>();
    }

    public Optional<Task> getTaskById(Long id) {
        // TODO: find a task in the list
        return Optional.empty();
    }

    public Task createTask(Task task) {
        // TODO: assign an ID and add it to the list
        return null;
    }

    public boolean updateTask(Long id, Task task) {
        // TODO: find the task and update its fields
        return false;
    }

    public boolean deleteTask(Long id) {
        // TODO: remove the task from the list
        return false;
    }

}
