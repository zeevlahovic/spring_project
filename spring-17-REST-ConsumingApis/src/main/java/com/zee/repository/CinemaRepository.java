package com.zee.repository;

import com.zee.entity.Cinema;
import com.zee.entity.BaseEntity;
import com.zee.entity.Genre;
import com.zee.enums.MovieState;
import com.zee.enums.MovieType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    @Entity
    @Data
    @NoArgsConstructor
    class Movie extends BaseEntity {

        private String name;

        @Column(columnDefinition = "DATE")
        private LocalDate releaseDate;

        private Integer duration;

        @Column(columnDefinition = "text")
        private String summary;

        @Enumerated(EnumType.STRING)
        private MovieType type;

        @Enumerated(EnumType.STRING)
        private MovieState state;

        private BigDecimal price;

        @ManyToMany
        @JoinTable(name = "movie_genre_rel", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
        private List<Genre> genreList;

    }
}
