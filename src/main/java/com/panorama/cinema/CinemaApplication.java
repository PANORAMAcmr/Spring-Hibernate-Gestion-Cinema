package com.panorama.cinema;

import com.panorama.cinema.dao.InitCinemaInterfcae;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApplication implements CommandLineRunner {
    @Autowired
    private InitCinemaInterfcae initCinemaInterfcae;

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        initCinemaInterfcae.initVille();
        initCinemaInterfcae.initCinema();
        initCinemaInterfcae.initSalle();
        initCinemaInterfcae.initPlace();
        initCinemaInterfcae.initTicket();
        initCinemaInterfcae.initSeance();
        initCinemaInterfcae.initProjectionFilm();
        initCinemaInterfcae.initFilm();
        initCinemaInterfcae.initCategorie();

    }
}
