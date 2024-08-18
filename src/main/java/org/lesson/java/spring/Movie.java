package org.lesson.java.spring;

public class Movie {
	
	private String movieId;
	private String movieTitle;
	
	public Movie(String movieId) {
		
		this.movieId = movieId;
		this.movieTitle = "";
	}	
	
	
	
	
	public String getMovieTitle() {
		return movieTitle;
	}


	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}


	public String getMovieId() {
		return movieId;
	}


	

}
