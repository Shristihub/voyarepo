package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieDetails {
	
	public List<String> showMovies(String language){
		List<String> movies = null;
		if(language.equals("English"))
			movies = Arrays.asList("a","b","c");
		if(language.equals("Tamil"))
			movies = Arrays.asList("a","b","c");
		if(language.equals("Malayalam"))
			movies = Arrays.asList("a","b","c");
		return movies;
	}

}
