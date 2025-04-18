package org.moviefusion.controller;

import java.util.List;

import org.moviefusion.model.MovieInfo;
import org.moviefusion.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class MovieController {

	@Autowired
	MovieService movieService;

	List<MovieInfo> list;

	@PostMapping("movie/addmovie")
	public String isAddNewMovie(@RequestBody MovieInfo movieInfo) {
		if (movieService.isAddNewMovie(movieInfo))
			return "Movie Added....!!";
		else
			return "Movie adding failed..!!";
	}

	@GetMapping("/movie/movies")
	public List<MovieInfo> getAllMovies() {
		list = movieService.getAllMovies();
		if (!list.isEmpty())
			return list;
		else
			return null;
	}

	@GetMapping("movie/movietitle/{movietitle}")
	public MovieInfo getMovieByTitle(@PathVariable("movietitle") String movie_title) {
		return movieService.getMovieByTitle(movie_title);
	}

	@GetMapping("/movie/category/{moviecategory}")
	public List<MovieInfo> getMovieByCategory(@PathVariable("moviecategory") String movie_category) {
		list = movieService.getMovieByCategory(movie_category);
		if (!list.isEmpty()) {
			return list;
		} else
			return null;
	}

	@GetMapping("/movie/search/{query_}")
	public List<MovieInfo> searchMovies(@PathVariable("query_") String query) {
		List<MovieInfo> list = movieService.searchMovies(query);
		if (!list.isEmpty()) {
			return list;
		} else {
			return null;
		}
	}

	@DeleteMapping("/movie/delete/{deleteid}")
	public String deleteMovieById(@PathVariable("deleteid") Integer deleteId) {
		if (movieService.deleteMovieById(deleteId))
			return "Movie Deleted...!!";
		else
			return "Movie Not Deleted.....!!";
	}

	@GetMapping("/movie/movieid/{movieid}")
	public MovieInfo getMovieById(@PathVariable("movieid") int movieId) {
		MovieInfo movie = movieService.getMovieById(movieId);
		if (movie != null)
			return movie;
		return null;
	}

	@PutMapping("/movie/update/{movieid}")
	public String updateMovieById(@PathVariable("movieid") Integer movieId, @RequestBody MovieInfo movieInfo) {
		if (movieService.updateMovieById(movieId, movieInfo))
			return "Movie Updated...!!";
		else
			return "Movie not updated...!!";
	}

	@GetMapping("/movie/getallgenres")
	public List<String> getAllGenres() {
		List<String> genres = movieService.getAllGenres();
		return genres;
	}
	
	@GetMapping("/movie/getmoviesbylanguage/{language}")
	public List<MovieInfo> getMoviesByLanguage(@PathVariable("language") String movie_language){
		
		list = movieService.getMoviesByLanguage(movie_language);
		if (!list.isEmpty()) {
			return list;
		} else
			return null;
		
	}

}
