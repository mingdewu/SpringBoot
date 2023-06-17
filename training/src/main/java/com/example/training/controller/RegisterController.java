package com.studytonight.controllers; 

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.models.User;
import com.example.service.UserService;
import com.example.training.entity.UserInfo;

@Controller
public class RegisterController{

	@Autowired 
	private UserInfo userInfo;
	
	@GetMapping("/")
	public String index() {
		return "register";
	}
	
	@PostMapping("save")
	public String save(@Valid @ModelAttribute User user, BindingResult result) {
		if(result.hasErrors()) {
			return "register";
		}else {
			 userService.register(user);
			 return "successful";
		}	
	}	
}