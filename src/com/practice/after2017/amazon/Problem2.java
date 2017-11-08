package com.practice.after2017.amazon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Problem2 {
	
	public Set<Movie> getMovieRecommendations(Movie movie, int N) {
		Set<Movie> ans = new HashSet<>();
		PriorityQueue<Movie> allSimilarMovies = getAllSimilarMovies(movie);
		for(int i = 0; allSimilarMovies.size() > 0 && N < ans.size() ; i++) {
			ans.add(allSimilarMovies.poll());
		}
		return ans;
	}
	
	private PriorityQueue<Movie> getAllSimilarMovies(Movie movie) {
		Comparator<Movie> compare = new Comparator<Movie>(){
			public int compare(Movie o1, Movie o2) {
				return Float.compare(o1.getRating(), o2.getRating());
			}
		};
		PriorityQueue<Movie> allSimilarMovies = new PriorityQueue<Movie>(compare);
		List<Integer> addedIds = new ArrayList<>(); 
		addedIds.add(movie.getId());
		List<Movie> similarMovies = movie.getSimilarMovies();
		Queue<Movie> traversalQueue = new LinkedList<>();
		addToQueue(traversalQueue, similarMovies, addedIds);
		
		while(!traversalQueue.isEmpty()) {
			Movie cMovie = traversalQueue.poll();
			allSimilarMovies.add(cMovie);
			addedIds.add(cMovie.getId());
			addToQueue(traversalQueue, cMovie.getSimilarMovies(), addedIds);
		}
		
		return allSimilarMovies;
	}
	
	private void addToQueue(Queue<Movie> queue, List<Movie> similarMovies, List<Integer> addedIds) {
		for(Movie eachMovie : similarMovies) {
			if(!addedIds.contains(eachMovie.getId())) {
				queue.add(eachMovie);
			}
		}
	}
	
	public static void main(String[] args) {
		Movie movie1 = new Movie(1, 1.2f);
		Movie movie2 = new Movie(2, 3.6f);
		Movie movie3 = new Movie(3, 2.4f);
		Movie movie4 = new Movie(4, 4.8f);
		Movie movie5 = new Movie(5, 6.6f);
		movie1.addSimilarMovie(movie2);
		movie1.addSimilarMovie(movie3);
		movie2.addSimilarMovie(movie1);
		movie2.addSimilarMovie(movie4);
		movie3.addSimilarMovie(movie1);
		movie3.addSimilarMovie(movie4);
		movie4.addSimilarMovie(movie2);
		movie4.addSimilarMovie(movie3);
		movie4.addSimilarMovie(movie5);
		Solution s = new Solution();
		Set<Movie> recommendations = s.getMovieRecommendations(movie2, 8);
		for(Movie m : recommendations) {
			System.out.println(m.getId() + " | " + m.getRating());
		}
	}
}
