package org.lesson.java.spring.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.lesson.java.spring.Movie;
import org.lesson.java.spring.Song;

public class BestOfListManager {
	
	//Variable used to count the object instance and to assign an incremental Id
	static int movieCount = 0;
	static int songCount = 0;
	
	//Method that create a new movie object and assign an incremental Id to it, formatted in 9 digits
	public static Movie getMovieIstance() {
		
		String movieId = String.format("%09d", movieCount);
			
		Movie movie  =  new Movie(movieId);
		
		movieCount++;
		
		return movie;
		
	}
	
	
	//Method that create a new song object and assign an incremental Id to it, formatted in 9 digits
	public static Song getSongIstance() {
		
		String songId = String.format("%09d", songCount);
			
		Song song  =  new Song(songId);
		
		songCount++;
		
		return song;
		
	}
	
	//Method that read the movie titles from a txt file, create a new object based on that and put it in a arraylist
	//The file file opened with this method have a list separated by ',' characters
	public static ArrayList<Movie> generateBestMovies() throws FileNotFoundException {
		
		ArrayList<Movie> bestMovies = new ArrayList<Movie>();
		
		
		File myFile = new File("./bestMovies.txt");
		Scanner myReader = new Scanner(myFile);
		myReader.useDelimiter(", ");
		
		
		int i = 0;
		while(myReader.hasNext()){
			
			bestMovies.add(getMovieIstance());
			bestMovies.get(i).setMovieTitle(myReader.next());
			i++;
			}
		
		myReader.close();
		
	
		return bestMovies;
	}
	
	//Method that read the song titles from a txt file, create a new object based on that and put it in a arraylist
	//The file file opened with this method have a list separated by lines
	public static ArrayList<Song> generateBestSongs() throws FileNotFoundException {
		
		ArrayList<Song> bestSongs = new ArrayList<Song>();
		
		
		File myFile = new File("./bestSongs.txt");
		Scanner myReader = new Scanner(myFile);
		
		
		int i = 0;
		while(myReader.hasNextLine()){
			bestSongs.add(getSongIstance());
			bestSongs.get(i).setSongTitle(myReader.nextLine());
			i++;
			}
		
		myReader.close();
		
	
		return bestSongs;
	}
	

}
