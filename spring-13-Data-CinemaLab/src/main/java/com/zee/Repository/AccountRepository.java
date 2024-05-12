package com.zee.Repository;


import com.zee.entity.Account;
import com.zee.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state

    List<Account> findByCountryOrState(String Country, String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<Account> findByAgeLessThanEqual(Integer age);

    //Write a derived query to list all accounts with a specific role
    List<Account> findByRole(UserRole role);


    //Write a derived query to list all accounts between a range of ages
    List<Account> findByAgeBetween(Integer minAge, Integer maxAge);


    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<Account> findByAddressStartingWith(String pattern);

    //Write a derived query to sort the list of accounts with age
    List<Account> findByOrderByAgeAsc();


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts
    @Query("SELECT a FROM Account a")
    List<Account> returnAllAccounts();


    //Write a JPQL query to list all admin accounts
    @Query("SELECT a FROM Account a WHERE a.role ='ADMIN'")
    List<Account> returnAllAdminAccounts();


    //Write a JPQL query to sort all accounts with age
    @Query("SELECT a FROM Account a ORDER BY a.age ASC ")
    List<Account> sortAllAccountByAge();

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    @Query(value = "SELECT * FROM account_details WHERE age < ?1", nativeQuery = true)
    List<Account> allAccountWithAgeLowerThan(Integer age);


    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    //@Query(value = "SELECT * FROM account_details WHERE ?1 IN (name, address, country, state, city)", nativeQuery = true)
    @Query(value = "SELECT * FROM account_details WHERE name ILIKE concat('%',?1,'%') OR addeess ILIKE concat('%',?1,'%') OR country ILIKE concat('%',?1,'%') OR state ILIKE concat('%',?1,'%') OR city ILIKE concat('%',?1,'%') ",nativeQuery = true)
    List<Account> specificValue(String keyword);

    //Write a native query to read all accounts with an age higher than a specific value
    @Query(value = "SELECT * FROM account_details WHERE age > ?1",nativeQuery = true)
    List<Account> ageHigherThan(Integer age);

}
