package com.zee;

import com.zee.Repository.AccountRepository;
import com.zee.Repository.CinemaRepository;
import com.zee.enums.UserRole;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestQuery implements CommandLineRunner {

    private final CinemaRepository cinemaRepository;
    private final AccountRepository accountRepository;

    public TestQuery(CinemaRepository cinemaRepository, AccountRepository accountRepository) {
        this.cinemaRepository = cinemaRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-------------CINEMA-------------------");
        System.out.println(cinemaRepository.findByName("Hall 1 - EMPIRE"));
        System.out.println(cinemaRepository.findByLocation_Country("United States"));
        System.out.println(cinemaRepository.findTop3BySponsoredName("Kodak"));
        System.out.println(cinemaRepository.findByNameOrSponsoredName("Hall 1 - EMPIRE", "Du Pont"));

        System.out.println("--------------------JPQL------------------------------");
        System.out.println(cinemaRepository.findCinemaById(1L));

        System.out.println("-------------------NATIVE QUERY------------------------");
        System.out.println(cinemaRepository.findCinemaByCountry("United States"));
        System.out.println(cinemaRepository.findCinemasByNameOrSponsoredNameContaining("McDonald"));
        System.out.println(cinemaRepository.sortByName());
        System.out.println(cinemaRepository.distinctAllBySponsoredName());

        System.out.println("------------------ACCOUNT QUERIES ---------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("---------------------DERIVED QUERIES----------------------");
        System.out.println(accountRepository.findByCountryOrState("United States", "Kentucky"));
        System.out.println(accountRepository.findByAgeLessThanEqual(50));
        System.out.println(accountRepository.findByRole(UserRole.USER));
        System.out.println(accountRepository.findByRole(UserRole.USER));
        System.out.println(accountRepository.findByAgeBetween(10,30));
        System.out.println(accountRepository.findByAddressStartingWith("26"));
        System.out.println(accountRepository.findByOrderByAgeAsc());
        System.out.println("-----------------------JPQL-----------------------------------------");
        System.out.println(accountRepository.returnAllAccounts());
        System.out.println(accountRepository.returnAllAdminAccounts());
        System.out.println(accountRepository.sortAllAccountByAge());
        System.out.println("--------------------------NATIVE QUERY---------------------------------");
        System.out.println(accountRepository.allAccountWithAgeLowerThan(30));
        System.out.println(accountRepository.specificValue("Josie D Story"));
        System.out.println(accountRepository.ageHigherThan(30));

    }
}
