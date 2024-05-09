package com.zee;

import com.zee.Repository.CinemaRepository;
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
        System.out.println(cinemaRepository.findByName("Hall 1 - EMPIRE"));
        System.out.println(cinemaRepository.findByLocation_Country("United States"));
        System.out.println(cinemaRepository.findTop3BySponsoredName("Kodak"));
        System.out.println(cinemaRepository.findByNameOrSponsoredName("Hall 1 - EMPIRE","Du Pont"));

        System.out.println("--------------------JPQL------------------------------");
        System.out.println(cinemaRepository.findCinemaById(1L));

        System.out.println("-------------------NATIVE QUERY------------------------");
        System.out.println(cinemaRepository.findCinemaByCountry("United States"));
        System.out.println(cinemaRepository.findCinemasByNameOrSponsoredNameContaining("McDonald"));
        System.out.println(cinemaRepository.sortByName());
        System.out.println(cinemaRepository.distinctAllBySponsoredName());


    }
}
