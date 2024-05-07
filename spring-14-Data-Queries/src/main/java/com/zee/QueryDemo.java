package com.zee;

import com.zee.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public QueryDemo(RegionRepository repository) {
        this.regionRepository = repository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("findByCountry" + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountry" + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainsOrderByRegion" + regionRepository.findByCountryContainsOrderByRegion("United"));
        System.out.println("findTop2ByCountry" + regionRepository.findTop2ByCountry("United States"));

    }
}