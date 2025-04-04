package org.moviefusion.repository;


import org.moviefusion.model.Login;
import org.moviefusion.model.UserMaster;

public interface UserMasterRepository {

	boolean isRegisterUser(UserMaster userMaster);

	boolean isLogin(Login login);
	
}
 