package org.lesson.java.spring.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.lesson.java.spring.Movie;

public class BestOfListManager {
	
	static int movieCount = 0;
	
	
	public static Movie getMovieIstance() {
		
		String movieId = String.format("%09d", movieCount);
			
		Movie movie  =  new Movie(movieId);
		
		movieCount++;
		
		return movie;
		
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
	
	

}
