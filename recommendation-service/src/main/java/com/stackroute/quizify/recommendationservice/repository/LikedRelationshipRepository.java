package com.stackroute.quizify.recommendationservice.repository;

import com.stackroute.quizify.recommendationservice.domain.Likes;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface LikedRelationshipRepository extends Neo4jRepository<Likes,String> {
}
