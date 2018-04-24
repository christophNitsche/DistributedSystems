package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/api/todos")
public class ToDosController {
	
    @Autowired
    private ToDoRepository repository;
    
    @GetMapping
    public @ResponseBody Iterable<ToDo> listAllTodos(Model model){
    	return repository.findAll();
    }
    
    @GetMapping(path="/{id}")
    public @ResponseBody ToDo getCertainToDo(@PathVariable Long id)
    {
    	return repository.findById(id).get();
    }
    
    @PostMapping
    public @ResponseBody String addNewToDo(@RequestParam Long id, @RequestParam String title)
    {
    	ToDo todo = new ToDo(id, title, false);
    	repository.save(todo);
    	return "ToDo successfully added";
    }
    
    @PutMapping(path="/{id}")
    public void updateToDo(@PathVariable Long id )
    {
    	ToDo toDo = repository.findById(id).get();
		toDo.setCompleted(true);
    	repository.save(toDo);
    }
    
    @DeleteMapping(path="/{id}")
    public void deleteToDo(@PathVariable Long id )
    {
    	repository.deleteById(id);
    }    
}