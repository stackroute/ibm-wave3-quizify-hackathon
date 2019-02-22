package com.stackroute.searchservice.service;

import com.stackroute.searchservice.domain.Genre;
import com.stackroute.searchservice.domain.Topic;
import com.stackroute.searchservice.exception.GenreAlreadyExistsException;
import com.stackroute.searchservice.exception.GenreDoesNotExistsException;
import com.stackroute.searchservice.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * This "GenreServiceImpl" Class implements all the methods declared by "GenreService" Interface.
 *
 * Spring @Service annotation is used with classes that provide business functionalities/logics.
 */


@Service
public class GenreServiceImpl implements GenreService{
    GenreRepository genreRepository;

    @Autowired
    public GenreServiceImpl(GenreRepository genreRepository){
        this.genreRepository = genreRepository;
    }

//    @Override
//    public List<Genre> getAllGenreByName(String genreName) throws GenreDoesNotExistsException {
//        List<Genre> allGenres = genreRepository.searchByGenreName(genreName);
//        if(allGenres==null)
//            throw new GenreDoesNotExistsException("No Game found");
//        else
//            return allGenres;
//    }

    @Override
    public Genre saveGenre(Genre genre) throws GenreAlreadyExistsException {
        return genreRepository.save(genre);
    }

    @Override
    public List<Genre> getAllGenreByStartsWith(String genreName) throws GenreDoesNotExistsException {
        List<Genre> genres = genreRepository.searchByGenreAlphabet(genreName);
        if(genres==null)
            throw new GenreDoesNotExistsException("No Game Found");
        else
            return genres;
    }
}
