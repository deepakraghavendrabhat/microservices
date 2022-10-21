package com.example.springboot.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {
	
	/*@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Muddu Spring Boot WS";
		
	} */
	@GetMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {

			   ModelAndView mv = new ModelAndView("hello");
			   mv.addObject("name", name);
			   return mv;

			}

}
