package com.greenfoxacademy.todo.Controllers;

import com.greenfoxacademy.todo.Models.Todo;
import com.greenfoxacademy.todo.Repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/todo"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive) {
        boolean listActives = false;
        if (isActive != null && isActive.equals("true")) listActives = true;

        model.addAttribute("listActives", listActives);
        model.addAttribute("todos", todoRepository.findAll());
        return "todo";
    }

    @GetMapping("/todo/add")
    public String addGet() {
        return "todoadd";
    }

    @PostMapping("/todo/add")
    public String addPost(String title) {
        todoRepository.save(new Todo(title));
        return "redirect:/todo";
    }

    @GetMapping("{id}/delete")
    public String delete(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/edit")
    public String editGet(@PathVariable Long id, Model model) {
        Todo todo = todoRepository.findById(id).get();
        model.addAttribute("id", todo.getId());
        model.addAttribute("title", todo.getTitle());
        model.addAttribute("done", todo.isDone());
        model.addAttribute("urgent", todo.isUrgent());
        return "todoedit";
    }

    @PostMapping("/{id}/edit")
    public String editPost(@PathVariable Long id, String title, boolean done, boolean urgent) {
        Todo todo = todoRepository.findAllById(id).get();
        todo.setTitle(title);
        todo.setDone(done);
        todo.setUrgent(urgent);
        todoRepository.save(todo);
        return "redirect:/todo";
    }
}
