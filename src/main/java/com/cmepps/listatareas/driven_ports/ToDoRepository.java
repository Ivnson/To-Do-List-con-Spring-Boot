package com.cmepps.listatareas.driven_ports;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listatareas.Entity.ToDo;

public interface ToDoRepository extends JpaRepository < ToDo, Long > {
    List < ToDo > findByUserName(String user);
}
