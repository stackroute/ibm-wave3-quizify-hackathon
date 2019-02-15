//package com.stackroute.seachService.controller;
//
//import com.stackroute.seachService.service.SearchService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.Api;
//
//@RestController
//@RequestMapping(value = "")
//@Api(value = "SearchController" , description = "this is the searchService")
//public class SearchController {
//    private SearchService searchService;
//    private ResponseEntity responseEntity;
//
//    @Autowired
//    public SearchController(SearchService searchService){
//        this.searchService = searchService;
//    }
//
//    @GetMapping(value = "/games{game}")
//    public  ResponseEntity<String> getAllSearchList(@PathVariable("game") String game)
//    {
//        searchService.findByGameName(game);
//        return new ResponseEntity<String>("jsonTemplate", HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/games{game}")
//    public ResponseEntity<String> getSearchByStartsWith(@PathVariable("game") String game){
//        searchService.findByStartsWith(game);
//        return new ResponseEntity<String>("jsonTempalte",HttpStatus.OK);
//    }
//}
