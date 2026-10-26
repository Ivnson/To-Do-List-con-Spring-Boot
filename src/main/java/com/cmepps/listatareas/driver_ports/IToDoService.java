package com.cmepps.listatareas.driver_ports;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cmepps.listatareas.Entity.ToDo;

public interface IToDoService {

    List < ToDo > getTodosByUser(String user);

    Optional < ToDo > getTodoById(long id);

    void updateTodo(ToDo todo);

    void addTodo(String name, String desc, Date targetDate, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(ToDo todo);
}
