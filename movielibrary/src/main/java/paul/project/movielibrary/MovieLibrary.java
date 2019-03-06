package paul.project.movielibrary;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Paul_2
 * Movie library class
 * Attributes : id, listMovies
 * Getters : getId, getListMovies
 * Methods : addMovie, modifyMovie, removeMovie
 * 
 * Purpose : This class aims to represent a movie library thanks to a list of movies (ArrayList collection) which are instantiations of the imported class Movie
 */
public class MovieLibrary {
	// class attribute
	private static long currentId=0;
	
	private long id;
	
	private ArrayList<Movie> listMovies;

	public MovieLibrary(ArrayList<Movie> listMovies) {
		super();
		this.id = MovieLibrary.getCurrentId();
		this.listMovies = listMovies;
	}

	@JsonProperty
	public long getId() {
		return id;
	}

	@JsonProperty
	public ArrayList<Movie> getListMovies() {
		return listMovies;
	}
	
	/*
	 * addMovie method
	 * inputs : movie
	 * outputs : _
	 * 
	 * purpose : This method aims to add a movie to the current collection of movies
	 */
	public void addMovie(Movie movie) {
		this.listMovies.add(movie);
	}
	
	/*
	 * modifyMovie method
	 * inputs : id, movie
	 * outputs : _
	 * 
	 * purpose : This method aims to modify a movie identified by its id using the setters in the current collection of movies
	 */
	public void modifyMovie(long id, Movie movie) {
		for (int i = 0; i < this.listMovies.size(); i++) {
		    if (this.listMovies.get(i).getId()==id) {
		    	this.listMovies.get(i).setDuration(movie.getDuration());
		    	this.listMovies.get(i).setTitle(movie.getTitle());
		    	this.listMovies.get(i).setReleaseDate(movie.getReleaseDate());
		    }
		}
	}
	
	/*
	 * removeMovie method
	 * inputs : id
	 * outputs : _
	 * 
	 * purpose : This method aims to remove a movie identified by its id from the current collection of movies
	 */
	public void removeMovie(long id) {
		for (int i = 0; i < this.listMovies.size(); i++) {
		    if (this.listMovies.get(i).getId()==id) {
		    	this.listMovies.remove(i);
		    }
		}
	}
	
	/*
	 * getCurrentId method
	 * inputs : _
	 * outputs : id
	 * 
	 * purpose : this class aims to identify instantiations of the class MovieLibrary thanks to the class attribute currentId
	 */
	private static long getCurrentId() {
		MovieLibrary.currentId++;
		return MovieLibrary.currentId;
	}
}
