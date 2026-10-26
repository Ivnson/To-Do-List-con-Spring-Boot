package com.cmepps.listatareas.driver_ports;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmepps.listatareas.Entity.ToDo;
import com.cmepps.listatareas.driven_ports.ToDoRepository;
import com.cmepps.listatareas.driver_ports.IToDoService;


@Service
public class ToDoService implements IToDoService {

    @Autowired
    private ToDoRepository todoRepository;

    @Override
    public List < ToDo > getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional < ToDo > getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(ToDo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
    	ToDo todo1 = new ToDo(name,desc,targetDate,isDone) ; 
        todoRepository.save(todo1);
    }

    @Override
    public void deleteTodo(long id) {
        Optional < ToDo > todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(ToDo todo) {
        todoRepository.save(todo);
    }
}