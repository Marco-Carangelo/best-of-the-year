package org.lesson.java.spring;

public class Movie {
	
	private Integer movieId;
	private String movieTitle;
	
	public Movie(int movieId, String movieTitle) {
		
		this.movieId = movieId;
		this.movieTitle = movieTitle;
	}	
	
	
	
	
	public String getMovieTitle() {
		return movieTitle;
	}


	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	

}
