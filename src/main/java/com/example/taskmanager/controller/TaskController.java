package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "index";
    }

    @GetMapping("/task/new")
    public String showCreateForm(Model model) {
        model.addAttribute("task", new Task());
        return "task-form";
    }

    @GetMapping("/task/edit/{id}")
    public String showEditForm(@PathVariable Long id,Model model) {
        for(Task foundTask:taskService.getAllTasks()) {
            if(foundTask.getId().equals(id)) {
                model.addAttribute("task", foundTask);

                return "task-form";
            }
        }
        return "/";
    }    
    @PostMapping("/task")
    public String createTask(@ModelAttribute Task task) {
        taskService.addTask(task);
        return "redirect:/";
    }
    @PostMapping("/task/update")
    public String updateTask(@ModelAttribute Task task) {
        System.out.println("Updating Task: ID=" + task.getId() + ", Title=" + task.getTitle());
        if(task.getId() != null) {
            taskService.updateTask(task);
        }
    return "redirect:/";
    }
    @GetMapping("/task/delete/{id}")
    public String deleteTask(@PathVariable  Long id) {
        taskService.DEleteTask(id);
        return "redirect:/";
        }
}   




