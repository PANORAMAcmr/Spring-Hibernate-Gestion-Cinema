package com.panorama.cinema.service;

import com.panorama.cinema.dao.*;
import com.panorama.cinema.entity.Cinema;
import com.panorama.cinema.entity.Place;
import com.panorama.cinema.entity.Salle;
import com.panorama.cinema.entity.Ville;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class InitCinemaImpl implements InitCinemaInterfcae {
    private final VilleRepository villeRepository;
    private final CinemaRepository cinemaRepository;
    private final SalleRepository salleRepository;
    private final PlaceRepository placeRepository;
    private final SeanceRepository seanceRepository;
    private final ProjectionFimRepository projectionFimRepository;
    private final TicketRepository ticketRepository;
    private final CategorieRepository categorieRepository;

    @Override
    public void initVille() {
        Stream.of("DOUALA", "YAOUNDE", "EDEA", "BAFOUSSAM", "NGAOUNDERE").forEach(
                villeName -> {
                    Ville ville = Ville.builder()
                            .name(villeName)
                            .build();
                    villeRepository.save(ville);
                }
        );

    }

    @Override
    public void initCinema() {
        villeRepository.findAll().forEach(
                ville -> {
                    Stream.of("LA PLAZA", "LE COUVERT", "LA ZONE").forEach(
                            cinemaName -> {
                                Cinema cinema = Cinema.builder()
                                        .ville(ville)
                                        .name(cinemaName)
                                        .nbreSalles((3 + (int) (Math.random() * 7)))
                                        .build();
                                cinemaRepository.save(cinema);
                            }
                    );
                }
        );
    }

    @Override
    public void initSalle() {
        cinemaRepository.findAll().forEach(
                cinema -> {
                    for (int i = 0; i < cinema.getNbreSalles(); i++) {
                        Salle salle = Salle.builder()
                                .Name("Salle" + (i + 1))
                                .cinema(cinema)
                                .nbrPlace(3 + ((int) (Math.random() * 5)))
                                .build();
                        salleRepository.save(salle);
                    }
                }
        );


    }

    @Override
    public void initProjectionFilm() {

    }

    @Override
    public void initFilm() {

    }

    @Override
    public void initCategorie() {

    }

    @Override
    public void initSeance() {

    }

    @Override
    public void initPlace() {
        salleRepository.findAll().forEach(
                salle -> {
                    for (int i = 0; i < salle.getNbrPlace(); i++) {
                        Place place = Place.builder()
                                .numero((i + 1))
                                .salle(salle)
                                .build();
                        placeRepository.save(place);
                    }
                }
        );

    }

    @Override
    public void initTicket() {

    }
}
