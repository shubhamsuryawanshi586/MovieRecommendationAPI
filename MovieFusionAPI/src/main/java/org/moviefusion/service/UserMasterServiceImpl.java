package org.moviefusion.service;


import org.moviefusion.model.Login;
import org.moviefusion.model.UserMaster;
import org.moviefusion.repository.UserMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMasterServiceImpl implements UserMasterService{

	@Autowired
	UserMasterRepository userMasterRepo;
	
	@Override
	public boolean isRegisterUser(UserMaster userMaster) {
		return userMasterRepo.isRegisterUser(userMaster);
	}

	@Override
	public boolean isLogin(Login login) {
		return userMasterRepo.isLogin(login);
	}

	

}
