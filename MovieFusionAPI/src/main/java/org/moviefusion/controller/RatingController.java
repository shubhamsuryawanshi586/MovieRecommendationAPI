package org.moviefusion.controller;

import org.moviefusion.model.Rating;
import org.moviefusion.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
	
	@Autowired
	RatingService ratingService;
	
	public String addRating(Rating rating)
	{
		ratingService.addRating(rating);
		return null;
	}

}
