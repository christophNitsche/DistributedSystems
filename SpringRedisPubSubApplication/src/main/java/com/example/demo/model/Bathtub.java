package com.example.demo.model;

import java.io.Serializable;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Bathtub")
public class Bathtub implements Serializable {

	public enum Producer{
		Prod1, Prod2
	}
	
	private String id;
	private String description;
	private Producer producer;
	private double fillcapacity;
	
	public Bathtub() {}
	
	public Bathtub(String id, String desc, Producer producer, double fill)
	{
		this.id = id;
		this.description = desc;
		this.producer = producer;
		this.fillcapacity = fill;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String desc)
	{
		this.description = desc;
	}
	
	public Producer getProducer()
	{
		return this.producer;
	}
	
	public void setProducer(Producer producer)
	{
		this.producer = producer;
	}
	
	public double getFillcapacity()
	{
		return this.fillcapacity;
	}
	
	public void setFillcapacity(double fill)
	{
		this.fillcapacity = fill;
	}
	
	@Override
	public String toString()
	{
		return "Baththub{" + "id=" + id + '\'' + ", description='" + description + '\'' + ", producer='" + producer + '\'' + ", fillcapacity='" + fillcapacity + '}';   
	}
}