package com.zee;

import com.zee.repository.DepartmentRepository;
import com.zee.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    public QueryDemo(RegionRepository repository, DepartmentRepository departmentRepository) {
        this.regionRepository = repository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-----------REGIONS-----------");

        System.out.println("findByCountry" + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountry" + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainsOrderByRegion" + regionRepository.findByCountryContainsOrderByRegion("United"));
        System.out.println("findTop2ByCountry" + regionRepository.findTop2ByCountry("United States"));
        System.out.println("findTopByCountryContainsOrderByRegion" + regionRepository.findTopByCountryContainsOrderByRegion("United States"));

        System.out.println("-----------DEPARTMENTS----------");

        System.out.println("findByDepartment" + departmentRepository.findByDepartment(("Furniture")));
        System.out.println("findByDivision" + departmentRepository.findByDivision("Health"));
        System.out.println("findByDivisionEndsWith" + departmentRepository.findByDivisionEndsWith("ics"));
        System.out.println("findDistinctTop3ByDivisionContains" + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));
    }
}
