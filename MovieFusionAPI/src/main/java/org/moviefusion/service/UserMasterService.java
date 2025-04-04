package org.moviefusion.service;


import org.moviefusion.model.Login;
import org.moviefusion.model.UserMaster;

public interface UserMasterService {

	boolean isRegisterUser(UserMaster userMaster);
	
	boolean isLogin(Login login);
}
