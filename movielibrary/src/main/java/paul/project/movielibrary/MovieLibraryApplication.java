package paul.project.movielibrary;

import java.util.ArrayList;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * @author Paul_2
 * Application class according to Getting Started Dropwizard page : https://www.dropwizard.io/1.3.9/docs/getting-started.html
 * Contains the main instantiation of MovieLibrary
 */
public class MovieLibraryApplication extends Application<MovieLibraryConfiguration> {
	
	private static MovieLibrary myLibrary = new MovieLibrary(new ArrayList<Movie>());
	
	/*
	 * main method
	 * 
	 * purpose : This method aims to add some movies in the current collection of movies for tests after having run the application
	 */
	public static void main(String[] args) throws Exception {
		new MovieLibraryApplication().run(args);
		myLibrary.addMovie(new Movie(128, 1987, "Der Himmel über Berlin"));
		myLibrary.addMovie(new Movie(112, 1993, "Cliffhanger"));
	}
	
	public static MovieLibrary getMyLibrary() {
		return myLibrary;
	}
	
	/*
	 * retrieveMovie method
	 * inputs : releaseDate
	 * outputs : library
	 * 
	 * purpose : This method aims to retrieve some movies identified by their release date in the current collection of movies
	 */
	public static MovieLibrary retrieveMovies(int releaseDate) {
		MovieLibrary library = new MovieLibrary(new ArrayList<Movie>());
		for (int i = 0; i < myLibrary.getListMovies().size(); i++) {
		    if (myLibrary.getListMovies().get(i).getReleaseDate()==releaseDate) {
		    	library.getListMovies().add(myLibrary.getListMovies().get(i));
		    }
		}
		return library;
	}
	
	/*
	 * run method
	 * 
	 * purpose : This method is taken from the Getting Started Dropwizard page
	 */
	@Override
	public void run(MovieLibraryConfiguration configuration, Environment environment) throws Exception {
		final MovieLibraryResource resource = new MovieLibraryResource();
		environment.jersey().register(resource);
	}
	
	/*
	 * initialize method
	 * 
	 * purpose : This method is taken from the Getting Started Dropwizard page
	 */
	@Override
	public void initialize(Bootstrap<MovieLibraryConfiguration> bootstrap) {
		super.initialize(bootstrap);
	}

}
