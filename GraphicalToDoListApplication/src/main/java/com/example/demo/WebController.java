package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @Autowired
    private ToDoRepository repository;

    @RequestMapping("/ui")
    String list(Model model){
        Iterable<ToDo> todos = repository.findAll();
        model.addAttribute("todos", todos);
        return "todos";
    }
	
}
