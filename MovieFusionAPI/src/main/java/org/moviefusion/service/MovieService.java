package org.moviefusion.service;

import java.util.List;

import org.moviefusion.model.MovieInfo;

public interface MovieService {
	
	public boolean isAddNewMovie(MovieInfo movieInfo); 
	
	public List<MovieInfo> getAllMovies();
	
	public MovieInfo getMovieByTitle(String movie_title);
	
	public List<MovieInfo> getMovieByCategory( String movie_category);
	
	public List<MovieInfo> searchMovies(String query);
	
	public boolean deleteMovieById(int deleteId);

	public MovieInfo getMovieById(int movieId);
	
	public boolean updateMovieById(int movieId, MovieInfo movieinfo);
}
