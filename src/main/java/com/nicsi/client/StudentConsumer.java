package com.nicsi.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentConsumer  
{

	@Autowired
	private StudentFeignClient client; 
	
	@GetMapping("consumer")
	public String showData() 
	{
		System.out.println(client.getClass().getName());
		
		return "CONSUMER=>"+client.getMsg();
		
	}
}
