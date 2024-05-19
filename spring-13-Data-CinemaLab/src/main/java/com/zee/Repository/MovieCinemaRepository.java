package com.zee.Repository;

import com.zee.entity.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieCinemaRepository extends JpaRepository<MovieCinema,Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read movie cinema with id
    Optional<MovieCinema> findById(Long id);


    //Write a derived query to count all movie cinemas with a specific cinema id
    long countByCinemaId(Long id);


    //Write a derived query to count all movie cinemas with a specific movie id
    long countByMovieId(Long id);


    //Write a derived query to list all movie cinemas with higher than a specific date
    List<MovieCinema> findByDateTimeAfter(LocalDateTime localDateTime);


    //Write a derived query to find the top 3 expensive movies
    List<MovieCinema> findFirst3ByOrderByMoviePriceDesc();


    //Write a derived query to list all movie cinemas that contain a specific movie name
    List<MovieCinema> findByMovie_NameContaining(String name);


    //Write a derived query to list all movie cinemas in a specific location name
    List<MovieCinema>findByCinema_Location_Name(String name);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movie cinemas with higher than a specific date

    @Query("SELECT m FROM MovieCinema m WHERE m.dateTime > ?1")
    List<MovieCinema> dateHigherThan(LocalDateTime localDateTime);


    // ------------------- Native QUERIES ------------------- //

    //Write a native query to count all movie cinemas by cinema id
    @Query(value = "SELECT COUNT(*) FROM movie_cinema WHERE cinema_id = ?1",nativeQuery = true)
    Integer countMovieCinemasById(Long id);


    //Write a native query that returns all movie cinemas by location name
    @Query(value = "SELECT mc.* FROM movie_cinema mc " +
            "JOIN cinema c ON mc.cinema_id = c.id " +
            "JOIN location l ON c.location_id = l.id " +
            "WHERE l.name = ?1", nativeQuery = true)
    List<MovieCinema> countMovieCinemasByLocationName(String locationName);


}
