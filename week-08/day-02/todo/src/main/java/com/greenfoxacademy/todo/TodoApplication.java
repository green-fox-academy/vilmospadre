package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.Models.Todo;
import com.greenfoxacademy.todo.Repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        todoRepository.save(new Todo("Finish all tasks!"));

        Todo todo1 = new Todo("Start the day!");
        todo1.setDone(true);
        todoRepository.save(todo1);

        Todo todo2 = new Todo("Finish H2 workshop!");
        todo2.setDone(true);
        todoRepository.save(todo2);

        Todo todo3 = new Todo("Finish JPA workshop!");
        todo3.setUrgent(true);
        todoRepository.save(todo3);

    }
}

