package com.cognizant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.models.Favorites;

public interface FavouriteRepository extends JpaRepository<Favorites, Long> {

}
