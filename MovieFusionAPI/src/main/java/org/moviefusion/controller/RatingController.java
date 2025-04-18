package org.moviefusion.controller;

import org.moviefusion.model.Rating;
import org.moviefusion.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
	
	@Autowired
	RatingService ratingService;
	
	@PostMapping("/rating/addrating")
	public String addRating(Rating rating)
	{
		boolean b = ratingService.addRating(rating);
		if(b)
			return "Rating Added";
		else
			return "Rating adding failed";
	}

}
