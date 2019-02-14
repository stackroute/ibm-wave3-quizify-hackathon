package com.stackroute.quizify.questionmanager.repository;

import com.stackroute.quizify.questionmanager.domain.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicRepository extends MongoRepository<Topic, String> {
//    boolean existsByTopicName(String topicName);
//    Optional<Topic> findByName(String topicName);
}
