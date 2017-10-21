package com.practice.after2017.amazon;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private int movieId;
	private float rating;
	private ArrayList<Movie> similarMovies;
	
	public Movie(int movieId, float rating) {
		this.movieId = movieId;
		this.rating = rating;
	}
	
	public void addSimilarMovie(Movie movie) {
		if(similarMovies == null) {
			similarMovies = new ArrayList<>();
		}
		similarMovies.add(movie);
	}
	
	public int getId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public ArrayList<Movie> getSimilarMovies() {
		return similarMovies;
	}
	public void setSimilarMovies(ArrayList<Movie> similarMovies) {
		this.similarMovies = similarMovies;
	}


}
