package org.lesson.java.spring.controller;

import org.lesson.java.spring.Movie;
import org.lesson.java.spring.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

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
		  
		  String bestMovies = "";
		  
		  for(Movie movie : getBestMovies()) {
			  
			  bestMovies += movie.getMovieTitle() + " , ";		  
			  
		  }
		  
		  model.addAttribute("name", name);
		  model.addAttribute("title", "List of the BEST movies");
		  model.addAttribute("list", bestMovies);
		  
		  return "lists";
		  
	  }
	  
	  @GetMapping("/songs")
	  public String songs(Model model) {
		 
		  String bestSongs = "";
		  
		  for(Song song : getBestSongs()) {
			  
			  bestSongs += song.getSongTitle() + " , ";	
			  
		  }
		  
		  model.addAttribute("name", name);
		  model.addAttribute("title", "List of the BEST songs");
		  model.addAttribute("list", bestSongs);
		  
		  
		  return "lists";
 
	  }

	  
	  
	  
	  
	  
	  @GetMapping("/song{id}")
	  public String songDetail(Model model, @PathVariable("id") Integer songId){
		 
		  String songName = "";
		  
		  for(Song song : getBestSongs()) {
			  
			  if (song.getSongId() == songId) {
				  
				  songName = song.getSongTitle();	
				  break;
			  }
			  
			  
		  }
		  
		  model.addAttribute("name", songName);
		  model.addAttribute("title", "Song detail");
		  
		  return "detail";
 
	  }
	  
	  @GetMapping("/song{id}")
	  public String movieDetail(Model model, @PathVariable("id") Integer movieId){
		 
		  String movieName = "";
		  
		  for(Movie movie : getBestMovies()) {
			  
			  if (movie.getMovieId() == movieId) {
				  
				  movieName = movie.getMovieTitle();	
				  break;
			  }
			  
			  
		  }
		  
		  model.addAttribute("name", movieName);
		  model.addAttribute("title", "Movie detail");
		  
		  return "detail";
 
	  }
	  
	  private List<Movie> getBestMovies(){
		  
		  
		  
		  //List used to acquire the movie objects 
		  List<Movie> bestMovies = new ArrayList<Movie>();
		  bestMovies.add(new Movie(0,"There will be blood"));
		  bestMovies.add(new Movie(1,"Fight club"));
		  bestMovies.add(new Movie(2,"Kill Bill"));
		  bestMovies.add(new Movie(3,"The big Lebwoski"));
		  bestMovies.add(new Movie(4,"Lo chiamavano Jeeg Robot"));
		  bestMovies.add(new Movie(5,"The world's end"));
		  bestMovies.add(new Movie(6,"The thing"));
		  bestMovies.add(new Movie(7,"The lord of the rings"));
		  bestMovies.add(new Movie(8,"Goodfellas"));
		  bestMovies.add(new Movie(9,"Memories of murder"));
		
		  
		  
		  return bestMovies;
		  
	  }
	  
	  private List<Song> getBestSongs(){
		  
		  
		  
		  //List used to acquire the movie objects 
		  List<Song> bestSongs = new ArrayList<Song>();
		  bestSongs.add(new Song(0,"Moonchild"));
		  bestSongs.add(new Song(1,"The Rover"));
		  bestSongs.add(new Song(2,"Escape from midwich valley"));
		  bestSongs.add(new Song(3,"The price"));
		  bestSongs.add(new Song(4,"War"));
		  bestSongs.add(new Song(5,"Bruco Gianluco"));
		  bestSongs.add(new Song(6,"Post(?) Organic"));
		  bestSongs.add(new Song(7,"Memento mori"));
		  bestSongs.add(new Song(8,"The old Haunt"));
		  bestSongs.add(new Song(9,"Tout petit moineau"));
		
		  
		  
		  return bestSongs;
		  
	  }
	  

}
