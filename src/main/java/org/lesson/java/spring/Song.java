package org.lesson.java.spring;

public class Song {
	
	private int songId;
	private String songTitle;
	
	
	public Song(int songId, String songTitle) {
		
		this.songId = songId;
		this.songTitle = songTitle;
	}


	public String getSongTitle() {
		return songTitle;
	}


	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}


	public int getSongId() {
		return songId;
	}	
	
	
	
}
