package org.moviefusion.service;

import org.moviefusion.model.Rating;
import org.moviefusion.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	RatingRepository ratingRepo;

	@Override
	public boolean addRating(Rating rating) {
		return ratingRepo.addRating(rating);
	}
}
