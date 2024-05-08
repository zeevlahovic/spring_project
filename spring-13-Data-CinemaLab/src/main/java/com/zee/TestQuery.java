package com.zee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestQuery implements CommandLineRunner {

    private final CinemaRepository cinemaRepository;

    public TestQuery(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-------------CINEMA-------------------");
        System.out.println(cinemaRepository.findByLocation_Country("United States"));


    }
}
