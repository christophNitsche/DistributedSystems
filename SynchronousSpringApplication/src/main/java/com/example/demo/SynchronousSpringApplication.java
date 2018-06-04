package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@SpringBootApplication
public class SynchronousSpringApplication {

	@GetMapping("/a")
	public String getAllTodos(Model model)
	{	System.out.println(model);
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:8080/api/todos";

		ResponseEntity<String> response = template.getForEntity(url, String.class);
		System.out.println(response);
		
		// https://stackoverflow.com/questions/40967921/create-json-object-using-jackson-in-java
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.createObjectNode();
		
		if (response != null)
		{
			System.out.println(response.getBody());
			// convert json string to json node
			model.addAttribute("alltodos", response.getBody());
			System.out.println(model.toString());
		}
		
		//name der html seite
		return "index";
	}
	
	@GetMapping("/")
    public String getItems(Model model){

		System.out.println("In getItems: "+model);

        RestTemplate template = new RestTemplate();
        
        String url = "http://localhost:8080/api/todos/";

        //ResponseEntity<String[]> response = template.getForEntity(url, String[].class);

        //System.out.println("In getItems: "+response);

        //if(response != null){
          //  model.addAttribute("items", response.getBody());
        //}
        
        return "index";

}
	
	
	/*
	public String callService()
	{
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:8080/demo/all";
		
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		
		return response.getBody();
	}	
	*/
	public static void main(String[] args) {
		SpringApplication.run(SynchronousSpringApplication.class, args);
		//SynchronousSpringApplication sSpringApp = new SynchronousSpringApplication();
		
		//System.out.println(sSpringApp.callService());
	}
}
