package org.moviefusion.service;

import org.moviefusion.model.Review;
import org.moviefusion.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewRepository reviewRepo;

	@Override
	public boolean addReview(Review review) {
		return reviewRepo.addReview(review);
	}
}
