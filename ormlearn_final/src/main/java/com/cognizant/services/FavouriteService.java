package com.cognizant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.models.Favorites;
import com.cognizant.models.Movie;
import com.cognizant.models.User;
import com.cognizant.repositories.FavouriteRepository;
import com.cognizant.repositories.MovieRepository;
import com.cognizant.repositories.UserRepository;

public class FavouriteService {
	@Autowired
	UserRepository userRepo;

	@Autowired
	MovieRepository movieRepo;

	@Autowired
	FavouriteRepository favRepo;

	public void addFavoritesMovie(long userId, long movieId) {
		User user = userRepo.findById(userId).get();

		Movie movie = movieRepo.findById(movieId).get();

		Favorites favourites = user.getFavourites();
		favourites.getMovieList().add(movie);

		favourites.setNoOfFavorites(favourites.getNoOfFavorites() + 1);

		favRepo.save(favourites);
	}

	public List<Movie> getAllFavoritesMovies(long userId) {
		User user = userRepo.findById(userId).get();

		Favorites favorites = user.getFavourites();

		return favorites.getMovieList();
	}

	public void removeFavoritesMovie(long userId, long movieId) {
		User user = userRepo.findById(userId).get();

		Movie movie = movieRepo.findById(movieId).get();

		Favorites favourites = user.getFavourites();
		favourites.getMovieList().remove(movie);

		favourites.setNoOfFavorites(favourites.getNoOfFavorites() - 1);

		favRepo.save(favourites);
	}

}
