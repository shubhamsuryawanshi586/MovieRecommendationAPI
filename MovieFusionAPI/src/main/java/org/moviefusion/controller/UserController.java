package org.moviefusion.controller;

import org.moviefusion.model.UserLogin;
import org.moviefusion.model.UserMaster;
import org.moviefusion.service.UserMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

	
	@PostMapping("/loginuser")
	public String isLogin(@RequestBody UserLogin login)
	{
		try
		{
			System.out.println("Received Login user data: " + login);
			if(userMasterService.isUserLogin(login))
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
