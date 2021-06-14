package com.jstit.todolist.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToDoModel {
    private int id, status;
    private String task;
}
