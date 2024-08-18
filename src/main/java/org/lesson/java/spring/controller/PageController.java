package org.lesson.java.spring.controller;

import org.lesson.java.spring.Movie;
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

	  
	  
	  
	  
	  private String getBestMovies() throws FileNotFoundException {
		  
		  String bestMovies = "";
		  ArrayList<Movie> bestMoviesList = BestOfListManager.generateBestMovies();
		  
		  
		  //bestMoviesList =  ;
		  
		  for(int i = 0; i < bestMoviesList.size(); i++ ) {
			  
			  bestMovies = bestMovies + bestMoviesList.get(i).getMovieTitle();
			  
			  if(i < bestMoviesList.size() - 1 )
				  bestMovies = bestMovies + ", ";
		  }
		  
		  return bestMovies;
		  
	  }
	  

}
