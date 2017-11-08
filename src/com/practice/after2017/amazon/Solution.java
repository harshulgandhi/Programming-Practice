package com.practice.after2017.amazon;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Solution {
	public Set<Movie> getMovieRecommendations(Movie movie, int N) {
	       Set<Movie> uniqueMovies = getAllMovies(movie);
	       PriorityQueue<Movie> topRatedMovies = new PriorityQueue<>(
	               (o1, o2) -> Float.compare(o2.getRating(), o1.getRating()));

	       topRatedMovies.addAll(uniqueMovies);

	       Set<Movie> ans = new HashSet<>();
	       for (int i = 0; topRatedMovies.size() > 0  && ans.size() != N; i++) {
	           Movie cMovie = topRatedMovies.poll();
	           if (cMovie!=null && (cMovie.getId() != movie.getId()))
	               ans.add(cMovie);
	       }
	       return ans;
	   }

	   public Set<Movie> getAllMovies(Movie movie) {
	       Set<Movie> movies = new HashSet<>();
	       Set<Movie> moviesAdded = new HashSet<>();
	       Queue<Movie> queue = new ArrayDeque<>();
	       queue.add(movie);
	       while (queue.size() > 0) {
	           Movie cMovie = queue.poll();
	           if (moviesAdded.contains(cMovie))
	               continue;
	           List<Movie> similarMovies = cMovie.getSimilarMovies();
	           if(similarMovies!=null && similarMovies.size() > 0){
	               for (int i = 0; i < similarMovies.size(); i++) {
	                   Movie sMovie = similarMovies.get(i);
	                   if (!moviesAdded.contains(sMovie) && movie.getId() != sMovie.getId()) {
	                       movies.add(sMovie);
	                       queue.add(sMovie);
	                   }
	               }
	           }
	           moviesAdded.add(cMovie);
	       }
	       return moviesAdded;

	   }
	   
	   public static void main(String[] args) {
//			Movie movie1 = new Movie(1, 1.2f);
//			Movie movie2 = new Movie(2, 2.4f);
//			Movie movie3 = new Movie(3, 2.4f);
//			Movie movie4 = new Movie(4, 2.4f);
//			Movie movie5 = new Movie(5, 8.8f);
//			movie1.addSimilarMovie(movie2);
//			movie1.addSimilarMovie(movie3);
//			movie2.addSimilarMovie(movie1);
//			movie2.addSimilarMovie(movie4);
//			movie3.addSimilarMovie(movie1);
//			movie3.addSimilarMovie(movie4);
//			movie4.addSimilarMovie(movie2);
//			movie4.addSimilarMovie(movie3);
//			movie5.addSimilarMovie(movie3);
//			movie3.addSimilarMovie(movie5);
			
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
			Solution s = new Solution();
//			Set<Movie> allMovies = a.getAllMovies(movie1);
//			for(Movie each:allMovies) {
//				System.out.println(each.getMovieId() + " | "+each.getRating());
//			}
			Set<Movie> recommendations = s.getMovieRecommendations(movie1, 2);
			for(Movie m : recommendations) {
				System.out.println(m.getId() + " | " + m.getRating());
			}
			
			
		}
}
