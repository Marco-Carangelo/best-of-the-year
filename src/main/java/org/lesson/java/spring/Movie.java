package org.lesson.java.spring;

public class Movie {
	
	private Integer id;
	private String title;
	
	public Movie(int movieId, String movieTitle) {
		
		this.id = movieId;
		this.title = movieTitle;
	}	
	
	
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String movieTitle) {
		this.title = movieTitle;
	}
	

	public int getId() {
		return id;
	}

	public void seId(int movieId) {
		this.id = movieId;
	}
	

}
