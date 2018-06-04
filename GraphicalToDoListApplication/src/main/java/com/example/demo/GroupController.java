/*
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

@Controller
@RequestMapping(path="/api/groups")
public class GroupController {

	@Autowired
	private GroupRepository groupRepo;

	@GetMapping
	public @ResponseBody Iterable<Group> listAllGroups(Model model)
	{
		return groupRepo.findAll();
	}
	
	@GetMapping(path="/{id}")
	public @ResponseBody Group getCertainGroup(@PathVariable Long id)
	{
		return groupRepo.findById(id).get();
	}
	
	@PostMapping
	public @ResponseBody Group addNewGroup(@RequestParam String groupName)
	{
		Group group = new Group(groupName);
		return groupRepo.save(group);
	}
	
	@DeleteMapping(path="/{id}")
	public void deleteGroup(@PathVariable Long id)
	{
		groupRepo.deleteById(id);
	}
}
*/