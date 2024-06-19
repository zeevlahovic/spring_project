package com.zee.service;

import com.zee.dto.GenreDTO;

public interface GenreService {

    GenreDTO save(GenreDTO genreDTO);
    void deleteById(Long id);

}
