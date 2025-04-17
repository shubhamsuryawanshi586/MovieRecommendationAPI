package org.moviefusion.controller;

import org.moviefusion.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.moviefusion.model.Review;

@RestController
public class ReviewController {

	@Autowired
	ReviewService reviewService;
	
	@PostMapping("/review/addreview")
	public String addReview(@RequestBody Review review){
		
		boolean b = reviewService.addReview(review);
		
		if(b)
			return "Review Added";
		else
			return "Review Failed";
	}
}
