package com.cloud.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cloud.pay.domain.User;
import com.cloud.pay.service.UserService;

@Controller
public class UserController {

	@Autowired
	@Qualifier("userService")
	private UserService userService ;
	
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
	public ModelAndView getUser(@RequestParam("userId")Integer id){
		
		User user = userService.query(id);
		ModelAndView view = new ModelAndView("user");
		return view.addObject("user", user);
		
	}
	
}
