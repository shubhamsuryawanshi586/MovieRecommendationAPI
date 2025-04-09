package org.moviefusion.repository;


import org.moviefusion.model.UserLogin;
import org.moviefusion.model.UserMaster;

public interface UserMasterRepository {

	boolean isRegisterUser(UserMaster userMaster);

	boolean isUserLogin(UserLogin login);
	
}
 