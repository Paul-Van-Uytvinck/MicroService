package paul.project.movielibrary;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Paul_2
 * Resource class according to Getting Started Dropwizard page : https://www.dropwizard.io/1.3.9/docs/getting-started.html
 * Communicates with HTTP methods
 */
@Path("/movieLibrary")
@Produces(MediaType.APPLICATION_JSON)
public class MovieLibraryResource {

	/*
	 * readMovies method
	 * inputs : _
	 * outputs : The current movie library from the application class
	 * 
	 * purpose : This method aims to set a GET request with extension /movies to serialize the current movie library from the application class
	 */
	@GET
	@Path("/movies")
	public MovieLibrary readMovies() {
		return MovieLibraryApplication.getMyLibrary();
	}
	
	/*
	 * createMovie method
	 * inputs : movie
	 * outputs : _
	 * 
	 * purpose : This method aims to set a POST request with extension /movie to deserialize a new movie to add to the current movie library from the application class
	 */
	@POST
	@Path("/movie")
	public void createMovie(Movie movie) {
		MovieLibraryApplication.getMyLibrary().addMovie(movie);
	}
	
	/*
	 * updateMovie method
	 * inputs : id, movie
	 * outputs : _
	 * 
	 * purpose : This method aims to set a PUT request with extension /movie/{id} to deserialize new values for an existing movie identified by its id in the current library
	 */
	@PUT
	@Path("/movie/{id}")
	public void updateMovie(@PathParam("id") long id, Movie movie) {
		MovieLibraryApplication.getMyLibrary().modifyMovie(id, movie);
	}
	
	/*
	 * deleteMovie method
	 * inputs : id
	 * outputs : _
	 * 
	 * purpose : This method aims to set a DELETE request with extension /movie/{id} to delete an existing movie identified by its id from the current library
	 */
	@DELETE
	@Path("/movie/{id}")
	public void deleteMovie(@PathParam("id") long id) {
		MovieLibraryApplication.getMyLibrary().removeMovie(id);
	}
	
	/*
	 * searchMovie method
	 * inputs : releaseDate
	 * outputs : The current movie library from the application class for the corresponding release date
	 * 
	 * purpose : This method aims to set a GET request with extension /movies/{releaseDate} to serialize the current movie library for the corresponding release date from the application class
	 */
	@GET
	@Path("/movies/{releaseDate}")
	public MovieLibrary searchMovie(@PathParam("releaseDate") int releaseDate) {
		return MovieLibraryApplication.retrieveMovies(releaseDate);
	}
}
