package com.todo.example.todoapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.todo.example.todoapp.model.Todo;

public interface TodoRepository extends MongoRepository<Todo, String> {

}
