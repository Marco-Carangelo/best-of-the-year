package org.lesson.java.spring;

public class Song {
	
	private Integer id;
	private String title;
	
	
	public Song(Integer songId, String songTitle) {
		
		this.id = songId;
		this.title = songTitle;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String songTitle) {
		this.title = songTitle;
	}


	public Integer getId() {
		return id;
	}	
	
	public void setId(Integer songId) {
		this.id = songId;
	}
	
}
