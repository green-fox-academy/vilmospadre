package com.greenfoxacademy.todo.Repository;


import com.greenfoxacademy.todo.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
