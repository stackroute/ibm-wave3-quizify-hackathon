package com.stackroute.quizify.recommendationservice.service;

import com.stackroute.quizify.recommendationservice.domain.Played;
import com.stackroute.quizify.recommendationservice.repository.PlayedRelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PlayedRelationshipServiceImpl implements PlayedRelationshipService {

    PlayedRelationshipRepository playedRelationshipRepository;

    @Autowired
    public PlayedRelationshipServiceImpl(PlayedRelationshipRepository playedRelationshipRepository) {
        this.playedRelationshipRepository = playedRelationshipRepository;
    }

    @Override
    public List<Played> getAllRealtionships() {
        return playedRelationshipRepository.getAllRelationships();
    }

    @Override
    public Played createRelationship(long userId, long gameId, int score) {
        return playedRelationshipRepository.createRelationship(userId,gameId,score);
    }

    @Override
    public Played deleteRelationship(long userId, long gameId) {
        return playedRelationshipRepository.deleteRelationship(userId,gameId);
    }
}
