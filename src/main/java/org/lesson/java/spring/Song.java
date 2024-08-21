package org.lesson.java.spring;

public class Song {
	
	private Integer songId;
	private String songTitle;
	
	
	public Song(Integer songId, String songTitle) {
		
		this.songId = songId;
		this.songTitle = songTitle;
	}


	public String getSongTitle() {
		return songTitle;
	}


	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}


	public Integer getSongId() {
		return songId;
	}	
	
	public void setSongTitle(Integer songId) {
		this.songId = songId;
	}
	
}
