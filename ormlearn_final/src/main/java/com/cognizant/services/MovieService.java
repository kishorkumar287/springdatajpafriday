package com.cognizant.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.models.Movie;
import com.cognizant.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepo;

	public List<Movie> getMovieListAdmin() {
		return movieRepo.findAll();
	}

	public List<Movie> getMovieListCustomer() {
		Date date = new Date();
		return movieRepo.getMovieListCustomer(date);
	}

	public void modifyMovie(Movie movie) {
		movieRepo.save(movie);
	}

	public Movie getMovie(long movieId) {
		return movieRepo.findById(movieId).get();
	}
	
}
