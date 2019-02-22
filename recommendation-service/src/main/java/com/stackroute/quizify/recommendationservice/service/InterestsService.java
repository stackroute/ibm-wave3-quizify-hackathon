package com.stackroute.quizify.recommendationservice.service;

import com.stackroute.quizify.recommendationservice.domain.Topic;
import com.stackroute.quizify.recommendationservice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InterestsService {

    LikesTopicService likesTopicService;
    Topic topic;

    @Autowired
    public InterestsService(LikesTopicService likesTopicService) {
        this.likesTopicService = likesTopicService;
    }

    public void getInterests(User user){
        List<String> interests=user.getInterests();
        long userId=user.getUserId();
        for(int i=0;i<interests.size();i++){
//            topic.setName(interests);
            likesTopicService.createRelationship(userId,topic.getId());
        }
    }

}
