package com.stackroute.quizify.recommendationservice.service;

import com.stackroute.quizify.recommendationservice.domain.LikesTopic;
import com.stackroute.quizify.recommendationservice.domain.Topic;
import com.stackroute.quizify.recommendationservice.repository.LikedRelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LikesTopicService {

    List<LikesTopic> getAllRealtionships();

    LikesTopic createRelationship(long userId, long topicId);

    LikesTopic deleteRelationship(long userId, long topicId);


}
