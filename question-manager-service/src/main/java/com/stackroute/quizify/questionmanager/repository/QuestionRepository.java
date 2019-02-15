package com.stackroute.quizify.questionmanager.repository;

import com.stackroute.quizify.questionmanager.domain.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {
    @Query("{ 'category._id': '?0' , 'topic._id': '?1' , 'level': '?2' }")
    List<Question> getQuestions(String categoryName, String topicName, String level);
    @Query("{ 'category._id': '?0' , 'topic._id': '?1' }")
    List<Question> getAllQuestions(String categoryName, String topicName);
}
