package com.stackroute.quizify.recommendationservice.repository;

import com.stackroute.quizify.recommendationservice.domain.LikesTopic;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikedRelationshipRepository extends Neo4jRepository<LikesTopic,String> {

    @Query("MATCH p=(Player)-[r:LikesTopic]->(Topic) RETURN p")
    public List<LikesTopic> getAllRelationships();

    @Query("MATCH (p:Player),(t:Topic) WHERE id(p)={PlayerId} and id(t)={TopicId} CREATE (p)-[q:LikesTopic}]->(t) RETURN p,q,t")
    LikesTopic createRelationship(@Param("PlayerId") long PlayerId, @Param("TopicId") long TopicId);

    @Query("MATCH (p:Player)-[r:LikesTopic]->(t:Topic) WHERE id(p)={PlayerId} and id(t)={TopicId} DELETE r RETURN 'relationship deleted' ")
    LikesTopic deleteRelationship(@Param("PlayerId") Long PlayerId, @Param("TopicId") long TopicId);
}
