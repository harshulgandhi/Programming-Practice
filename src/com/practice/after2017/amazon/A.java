package com.practice.after2017.amazon;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class A {
	
	public Set<Movie> getAllMovies(Movie movie) {
		Set<Movie> allMovies = new HashSet<>();
		Set<Integer> addedIds = new HashSet<>();
		addedIds.add(movie.getId());
		Queue<Movie> moviesToCheck = new LinkedList<Movie>();
		List<Movie> similarMovies = movie.getSimilarMovies();
		
		for(Movie m : similarMovies) {
			moviesToCheck.add(m);
		}
		
		addSimilarMoviesToQueue(movie, moviesToCheck, addedIds);
		
		while(moviesToCheck.size() > 0) {
			Movie eachMovie = moviesToCheck.poll();
			allMovies.add(eachMovie);
			addedIds.add(eachMovie.getId());
			addSimilarMoviesToQueue(eachMovie, moviesToCheck, addedIds);
			
		}
		
		return allMovies;
	}
	
	private void addSimilarMoviesToQueue(Movie movie, Queue<Movie> moviesToCheck, Set<Integer> addedIds) {
		List<Movie> similarMovies = movie.getSimilarMovies();
		for(Movie m : similarMovies) {
			if(!addedIds.contains(m.getId())){
				moviesToCheck.add(m);				
			}
		}
	}
	
	public Set<Movie> getMovieRecommendations(Movie movie, int N){
		Set<Movie> recommendation = new HashSet<>();
		Set<Movie> allSimilarMovies = getAllMovies(movie);
		if(N > allSimilarMovies.size()) {
			return allSimilarMovies;
		}
		
//		PriorityQueue<Movie> topRatedMovies = new PriorityQueue<Movie>(
//				(o1,o2) -> Float.compare(o1.getRating(), o2.getRating())
//				);
		Comparator<Movie> c = new Comparator<Movie>(){
				@Override
				public int compare(Movie o1, Movie o2){
					return Float.compare(o1.getId(), o2.getId()); 
				}
		};
		PriorityQueue<Movie> topRatedMovies = new PriorityQueue<Movie>(c);
		
		for(Movie eachConnectedM : allSimilarMovies) {
			topRatedMovies.add(eachConnectedM);
		}
		
		for(int i = 0; i<N; i++) {
			recommendation.add(topRatedMovies.poll());
		}
		
		return recommendation;
	}

	public static void main(String[] args) {
		Movie movie1 = new Movie(1, 1.2f);
		Movie movie2 = new Movie(2, 3.6f);
		Movie movie3 = new Movie(3, 2.4f);
		Movie movie4 = new Movie(4, 4.8f);
		movie1.addSimilarMovie(movie2);
		movie1.addSimilarMovie(movie3);
		movie2.addSimilarMovie(movie1);
		movie2.addSimilarMovie(movie4);
		movie3.addSimilarMovie(movie1);
		movie3.addSimilarMovie(movie4);
		movie4.addSimilarMovie(movie2);
		movie4.addSimilarMovie(movie3);
		
		A a = new A();
//		Set<Movie> allMovies = a.getAllMovies(movie1);
//		for(Movie each:allMovies) {
//			System.out.println(each.getMovieId() + " | "+each.getRating());
//		}
		Set<Movie> recommendations = a.getMovieRecommendations(movie1, 2);
		for(Movie m : recommendations) {
			System.out.println(m.getId() + " | " + m.getRating());
		}
		
		
	}

}
