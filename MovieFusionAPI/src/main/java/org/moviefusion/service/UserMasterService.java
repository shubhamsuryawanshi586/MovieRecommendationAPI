package org.moviefusion.service;


import org.moviefusion.model.UserLogin;
import org.moviefusion.model.UserMaster;

public interface UserMasterService {

	boolean isRegisterUser(UserMaster userMaster);
	
	boolean isUserLogin(UserLogin login);
}
