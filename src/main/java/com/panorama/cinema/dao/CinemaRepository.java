package com.panorama.cinema.dao;

import com.panorama.cinema.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
