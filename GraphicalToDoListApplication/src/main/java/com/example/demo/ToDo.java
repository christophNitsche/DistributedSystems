package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ToDo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private Boolean completed;
	
	
	ToDo () {}
	
	ToDo(/*Long id,*/ String title, Boolean completed)
	{
		//this.id = id;
		this.title = title;
		this.completed = completed;
	}
	
	public void setId(Long id)
	{
		this.id = id;		
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setCompleted(Boolean completed)
	{
		this.completed = completed;
	}
	
	public Long getId()
	{
		return this.id;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public Boolean getCompleted()
	{
		return this.completed;
	}
	
	@Override
	public String toString()
	{
		return "Id: " + this.id + " - Title: " + this.title + " - Completed: " + this.completed + "-";
	}
	
}
