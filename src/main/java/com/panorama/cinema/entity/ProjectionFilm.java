package com.panorama.cinema.entity;

import com.panorama.cinema.common.AbstractHibernatePersistanceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectionFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateProjection;
    private double prix;
    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy = "projectionFilm")
    private Collection<Film> film;
    @OneToOne
    private Seance seance;
    @OneToMany(mappedBy = "projectionFilm")
    private Collection<Ticket> ticketCollection;
}
