package org.moviefusion.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.moviefusion.model.Login;
import org.moviefusion.model.UserMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

@Repository
public class UserMasterRepositoryImpl implements UserMasterRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	List<Login> list;
	
	@Override
	public boolean isRegisterUser(UserMaster userMaster) {
		
		int value = jdbcTemplate.update("insert into user_master(user_name, email, password) values (?, ?, ?)", new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, userMaster.getUser_name());
				ps.setString(2, userMaster.getEmail());
				ps.setString(3, userMaster.getPassword());
				
			}});
		
		return value > 0;
	}

	@Override
    public boolean isLogin(Login login) {
        String sql = "SELECT COUNT(*) FROM user_master WHERE email = ? AND password = ?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, login.getEmail(), login.getPassword());
        return count != null && count > 0;
    }

}
