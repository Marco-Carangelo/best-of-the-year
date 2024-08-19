package org.lesson.java.spring.controller;

import org.lesson.java.spring.Movie;
import org.lesson.java.spring.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;
import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class PageController {
	private String name = "Marco Carangelo";
	
	  @GetMapping("/home")
	  public String home(Model model) {
		  
		  model.addAttribute("name", name);
		  
		return "home";
		  
	  }
	  
	  @GetMapping("/movies")
	  public String movies(Model model) throws FileNotFoundException {
		  
		  model.addAttribute("name", name);
		  model.addAttribute("movieList", getBestMovies());
		  
		return "movies";
		  
	  }
	  
	  @GetMapping("/songs")
	  public String songs(Model model) throws FileNotFoundException {
		  
		  model.addAttribute("name", name);
		  model.addAttribute("songList", getBestSongs());
		  
		return "songs";
		  
	  }

	  
	  
	  
	  //Method that return a string with the titles of movie objects
	  
	  private String getBestMovies() throws FileNotFoundException {
		  
		  String bestMovies = "";
		  
		  //List used to acquire the movie objects 
		  ArrayList<Movie> bestMoviesList = BestOfListManager.generateBestMovies();
		  		  
		  //Cycle used to concatenate the movie titles into one string
		  for(int i = 0; i < bestMoviesList.size(); i++ ) {
			  
			  bestMovies = bestMovies + bestMoviesList.get(i).getMovieTitle();
			  
			  if(i < bestMoviesList.size() - 1 )
				  bestMovies = bestMovies + ", ";
		  }
		  
		  return bestMovies;
		  
	  }
	  
	//Method that return a string with the titles of song objects, analog to getBestMovie method
	  
	  private String getBestSongs() throws FileNotFoundException {
		  
		  String bestSongs = "";
		  ArrayList<Song> bestSongsList = BestOfListManager.generateBestSongs();
		  
		  
		  for(int i = 0; i < bestSongsList.size(); i++ ) {
			  
			  bestSongs = bestSongs + bestSongsList.get(i).getSongTitle();
			  
			  if(i < bestSongsList.size() - 1 )
				  bestSongs = bestSongs + ", ";
		  }
		  
		  return bestSongs;
		  
	  }
	  

}
