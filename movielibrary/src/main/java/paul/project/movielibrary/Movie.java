package paul.project.movielibrary;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Paul_2
 * Movie class
 * Attributes : id, duration, releaseDate, title
 * Getters : getId, getDuration, getReleaseDate, getTitle
 * Setters : setId, setDuration, setReleaseDate, setTitle
 * 
 * Purpose : This class aims to represent a movie thanks to simple attributes such as the film duration, its title or its release date
 */
public class Movie {
	// class attribute
	private static long currentId=0;
	
	private long id;

	private int duration;
	
	private int releaseDate;
	
	private String title;

	public Movie(int duration, int releaseDate, String title) {
		super();
		this.id = Movie.getCurrentId();
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.title = title;
	}

	public Movie() {
		this.id = Movie.getCurrentId();
	}
	
	@JsonProperty
	public long getId() {
		return id;
	}

	@JsonProperty
	public int getDuration() {
		return duration;
	}

	@JsonProperty
	public int getReleaseDate() {
		return releaseDate;
	}

	@JsonProperty
	public String getTitle() {
		return title;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	@JsonProperty("duration")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@JsonProperty("releaseDate")
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}
	
	/*
	 * getCurrentId method
	 * inputs : _
	 * outputs : id
	 * 
	 * purpose : this class aims to identify instantiations of the class Movie thanks to the class attribute currentId
	 */
	private static long getCurrentId() {
		Movie.currentId++;
		return Movie.currentId;
	}
}
