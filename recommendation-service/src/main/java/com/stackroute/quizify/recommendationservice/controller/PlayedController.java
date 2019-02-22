package com.stackroute.quizify.recommendationservice.controller;

import com.stackroute.quizify.recommendationservice.domain.Played;
import com.stackroute.quizify.recommendationservice.service.PlayedRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class PlayedController {

    PlayedRelationshipService playedRelationshipService;

    @Autowired
    public PlayedController(PlayedRelationshipService playedRelationshipService) {
        this.playedRelationshipService = playedRelationshipService;
    }

    @GetMapping("/")
    public List<Played> getAll(){
        return playedRelationshipService.getAllRealtionships();
    }

//    @GetMapping("/id")
//    public Played getOne(@RequestParam("PlayedId") long PlayedId){
//        return PlayedService.getone(PlayedId);
//    }

//    @PostMapping("/")
//    public Played create(@RequestParam("")){
//        return PlayedService.createRelationship(Played);
//    }

    @DeleteMapping("/")
    public Played delete(@RequestParam("userId") long userId, @RequestParam("topicId") long topicId){
        return playedRelationshipService.deleteRelationship(userId,topicId);
    }
}
