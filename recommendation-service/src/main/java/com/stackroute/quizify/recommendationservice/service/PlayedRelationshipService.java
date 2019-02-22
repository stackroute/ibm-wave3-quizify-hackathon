package com.stackroute.quizify.recommendationservice.service;

import com.stackroute.quizify.recommendationservice.domain.Played;

import java.util.List;

public interface PlayedRelationshipService {

    List<Played> getAllRealtionships();

    Played createRelationship(long userId, long gameId, int score);

    Played deleteRelationship(long userId, long gameId);
}
