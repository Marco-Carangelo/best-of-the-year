package org.lesson.java.spring.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.lesson.java.spring.Movie;
import org.lesson.java.spring.Song;

public class BestOfListManager {
	
	static int movieCount = 0;
	static int songCount = 0;
	
	
	public static Movie getMovieIstance() {
		
		String movieId = String.format("%09d", movieCount);
			
		Movie movie  =  new Movie(movieId);
		
		movieCount++;
		
		return movie;
		
	}
	
	
	public static Song getSongIstance() {
		
		String songId = String.format("%09d", songCount);
			
		Song song  =  new Song(songId);
		
		songCount++;
		
		return song;
		
	}
	
	
	public static ArrayList<Movie> generateBestMovies() throws FileNotFoundException {
		
		ArrayList<Movie> bestMovies = new ArrayList<Movie>();
		
		
		File myFile = new File("./bestMovies.txt");
		Scanner myReader = new Scanner(myFile);
		myReader.useDelimiter(", ");
		
		while(myReader.hasNext()){
			bestMovies.add(getMovieIstance());
			bestMovies.get(movieCount-1).setMovieTitle(myReader.next());
			}
		
		myReader.close();
		
	
		return bestMovies;
	}
	
	public static ArrayList<Song> generateBestSongs() throws FileNotFoundException {
		
		ArrayList<Song> bestSongs = new ArrayList<Song>();
		
		
		File myFile = new File("./bestSongs.txt");
		Scanner myReader = new Scanner(myFile);
		
		while(myReader.hasNextLine()){
			bestSongs.add(getSongIstance());
			bestSongs.get(songCount-1).setSongTitle(myReader.nextLine());
			}
		
		myReader.close();
		
	
		return bestSongs;
	}
	

}
