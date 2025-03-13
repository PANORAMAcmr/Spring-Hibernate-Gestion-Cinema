package com.panorama.cinema.dao;

import com.panorama.cinema.entity.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectionFimRepository extends JpaRepository<ProjectionFilm,Long> {
}
