package org.moviefusion.repository;

import org.moviefusion.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RatingRepositoryImpl implements RatingRepository{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean addRating(Rating rating) {
		return false;
	}

}
