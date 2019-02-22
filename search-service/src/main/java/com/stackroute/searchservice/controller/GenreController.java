package com.stackroute.searchservice.controller;

import com.stackroute.searchservice.domain.Genre;
import com.stackroute.searchservice.exception.GenreAlreadyExistsException;
import com.stackroute.searchservice.exception.GenreDoesNotExistsException;
import com.stackroute.searchservice.service.GenreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
@Api(description="Search by Genre")
public class GenreController {
    GenreService genreService;
    private ResponseEntity<?> responseEntity;

    @Autowired
    public GenreController(GenreService genreService){
        this.genreService = genreService;
    }

//    @ApiOperation(value = "Search Genre By Name")
//    @GetMapping("/search/{topicName}")
//    public ResponseEntity<?> searchGenreByName(@PathVariable String genreName){
//        try {
//            return new ResponseEntity<List<Genre>>(genreService.getAllGenreByName(genreName), HttpStatus.OK);
//        }
//        catch (GenreDoesNotExistsException e)
//        {
//            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
//        }
//    }

    @ApiOperation(value = "Save Genre")
    @PostMapping
    public ResponseEntity<?> saveGenre(@RequestBody Genre genre){
        try
        {
            return new ResponseEntity<Genre>(genreService.saveGenre(genre), HttpStatus.OK);
        }
        catch (GenreAlreadyExistsException e)
        {
            return new ResponseEntity<String >(e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

    @ApiOperation(value = "Search Genre By Starts With")
    @GetMapping("/search/{genreName}")
    public ResponseEntity<?>searchGenreByStartsWith(@PathVariable String genreName){
        try {
            return new ResponseEntity<List<Genre>>(genreService.getAllGenreByStartsWith(genreName), HttpStatus.OK);
        }
        catch (GenreDoesNotExistsException e)
        {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
