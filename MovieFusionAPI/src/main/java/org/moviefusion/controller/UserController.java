package org.moviefusion.controller;

import org.moviefusion.model.Login;
import org.moviefusion.model.UserMaster;
import org.moviefusion.service.UserMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
	
	@Autowired
	UserMasterService userMasterService; 
	
	@PostMapping("/registeruser")
	public String isRegisterUser(@RequestBody UserMaster user_master) {
	    try {
	        System.out.println("Received user data: " + user_master);
	        boolean isRegistered = userMasterService.isRegisterUser(user_master);
	        return isRegistered ? "User Registered.....!!" : "User Not Registered.....!!";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "Error: " + e.getMessage();
	    }
	}

	
	@PostMapping("/login")
	public String isLogin(@RequestBody Login login)
	{
		try
		{
			System.out.println("Received Login user data: " + login);
			if(userMasterService.isLogin(login))
				return  "Login Successful...!!";
			else
				return "Login Failed...!!";
		}
		catch(Exception e)
		{
			e.printStackTrace();
	        return "Error: " + e.getMessage();
		}
	}

}
