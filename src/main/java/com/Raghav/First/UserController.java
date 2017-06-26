package com.Raghav.First;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/greet/{name}")
	public String greet(@PathVariable("name")String name){
		return "Hello:"+name;
	}

}
