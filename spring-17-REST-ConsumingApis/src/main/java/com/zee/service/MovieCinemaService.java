package com.zee.service;

import com.zee.dto.MovieCinemaDTO;

import java.util.List;

public interface MovieCinemaService {

    List<MovieCinemaDTO> findAll();
    MovieCinemaDTO findById(Long id);

}
