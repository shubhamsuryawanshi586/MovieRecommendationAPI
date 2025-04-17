package org.moviefusion.controller;

import java.util.List;

import org.moviefusion.model.Watchlist;
import org.moviefusion.service.WatchListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class WatchListController {
	
	@Autowired
	WatchListService watchListService;
	
	@PostMapping("watchlist/addmovie/{userid}/{movieid}")
	public String isAddMovieWatchList(@PathVariable("userid") Integer userId, @PathVariable("movieid") Integer movieId) {
	    boolean added = watchListService.isAddMovieWatchList(userId, movieId);
	    
	    if (added) {
	        return "Movie added to your watchlist!";
	    } else {
	        return "Movie Already in watchlist";
	    }
	}

	@GetMapping("watchlist/allWatchlist/{userid}")
	public List<Watchlist> getAllWatchList(@PathVariable("userid") Integer userId)
	{
		if(watchListService.getAllWatchList(userId) != null)
			return watchListService.getAllWatchList(userId);
		else
		return null;
	}
	
	

}
