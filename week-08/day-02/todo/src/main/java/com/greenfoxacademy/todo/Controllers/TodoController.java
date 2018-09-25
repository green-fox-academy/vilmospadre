package com.greenfoxacademy.todo.Controllers;

import com.greenfoxacademy.todo.Repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todo")
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todo";

    }
}

