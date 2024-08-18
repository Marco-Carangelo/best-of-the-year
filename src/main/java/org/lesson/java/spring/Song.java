package org.lesson.java.spring;

public class Song {
	
	private String songId;
	private String songTitle;
	
	
	public Song(String songId) {
		
		this.songId = songId;
		this.songTitle = "";
	}


	public String getSongTitle() {
		return songTitle;
	}


	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}


	public String getSongId() {
		return songId;
	}	
	
	
	
}
