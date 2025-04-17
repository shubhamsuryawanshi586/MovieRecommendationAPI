package org.moviefusion.repository;

import org.moviefusion.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepositoryImpl implements ReviewRepository{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean addReview(Review review) {
		return false;
	}

}
