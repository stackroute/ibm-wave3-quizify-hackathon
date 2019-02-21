/*
package com.stackroute.quizify.recommendationservice.repository;

import com.stackroute.quizify.recommendationservice.domain.Played;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface PlayedRelationshipRepository extends Neo4jRepository<Played,String> {
    @Query("MATCH p=(Player)-[r:QUIZPLAYED]->(Topic) RETURN p")
    public List<Played> getAllRelationships();

    */
/*MATCH (a:LabeofNode1), (b:LabeofNode2)
    WHERE a.name = "nameofnode1" AND b.name = " nameofnode2"
    CREATE (a)-[: Relation]->(b)
    RETURN a,b*//*

//MATCH (t1:Topic),(t2:Topic) WHERE id(t1)=2 and id(t2)=0 CREATE (t1)-[:QUIZPLAYED{score:7}]->(t2) RETURN t1,t2
    @Query("MATCH (p:Player),(t:Topic) WHERE id(p)={PlayerId} and id(t)={TopicId} CREATE (p)-[q:QUIZPLAYED{score:{score}}]->(t) RETURN p,q,t")
    Quiz createRelationship(@Param("PlayerId") long PlayerId, @Param("TopicId") long TopicId, @Param("score") int score);

    //    MATCH (Raul)-[r:PLAYER_OF]->(It) WHERE id(r)=10
//    DELETE r
    @Query("MATCH (p:Player)-[r:PlayedPLAYED]->(t:Topic) WHERE id(p)={PlayerId} and id(t)={TopicId} DELETE r RETURN 'relationship deleted' ")
    Played deleteRelationship(@Param("PlayerId") Long PlayerId, @Param("TopicId") long TopicId); // @Param("RelationshipId") long RelationshipId);

*/
/*  match (p)-[old:PlayedPLAYED]->(t)
    create (p)-[new:PLAYED]->(t)
    delete old*//*


//    @Query("MATCH (p:Player)-[old:PlayedPLAYED]->(t:Topic) CREATE (p:Player)-[new:{name}]->(t:Topic) DELETE old")
//    Played updateNode(@Param("PlayerId") Long PlayerId, @Param("TopicId") long TopicId, @Param("name") String name);

}
*/
