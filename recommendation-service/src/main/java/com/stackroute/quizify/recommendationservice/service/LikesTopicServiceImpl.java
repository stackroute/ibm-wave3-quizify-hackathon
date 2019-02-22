package com.stackroute.quizify.recommendationservice.service;

import com.stackroute.quizify.recommendationservice.domain.LikesTopic;
import com.stackroute.quizify.recommendationservice.domain.Topic;
import com.stackroute.quizify.recommendationservice.repository.LikedRelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikesTopicServiceImpl implements LikesTopicService {
    private LikedRelationshipRepository likedRelationshipRepository;

    @Autowired
    public LikesTopicServiceImpl(LikedRelationshipRepository likedRelationshipRepository) {
        this.likedRelationshipRepository = likedRelationshipRepository;
    }

    @Override
    public LikesTopic createRelationship(long userId, long topicId) {
        return likedRelationshipRepository.createRelationship(userId,topicId);
    }

    @Override
    public List<LikesTopic> getAllRealtionships() {
        return likedRelationshipRepository.getAllRelationships();
    }

    @Override
    public LikesTopic deleteRelationship(long userId, long topicId) {
        return likedRelationshipRepository.deleteRelationship(userId,topicId);
    }
}
