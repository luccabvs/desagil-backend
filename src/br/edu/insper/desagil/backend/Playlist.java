package br.edu.insper.desagil.backend;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends Collection{
	
	private String user;
	private List<Movie> movies;
	
	public Playlist(String title, String user) {
		super(title);
		this.user = user;
		this.movies = new ArrayList<>();
	}

	public String getUser() {
		return user;
	}

	public List<Movie> getMovies() {
		return movies;
	}
	
	public void addMovie(Movie filme) {
		this.movies.add(filme);
	}
}
