package com.stackroute.searchservice.service;

import com.stackroute.searchservice.domain.Topic;
import com.stackroute.searchservice.exception.TopicDoesNotExistsException;
import com.stackroute.searchservice.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * This "TopicServiceImpl" Class implements all the methods declared by "TopicService" Interface.
 *
 * Spring @Service annotation is used with classes that provide business functionalities/logics.
 */

@Service
public class TopicServiceImpl implements TopicService{

    private TopicRepository topicRepository;

    @Autowired
    public TopicServiceImpl(TopicRepository topicRepository){
        this.topicRepository=topicRepository;
    }

    @Override
    public List<Topic> getAllTopicByName(String topicName) throws TopicDoesNotExistsException {
        List<Topic> allTopics = topicRepository.searchByTopicName(topicName);
        if(allTopics==null)
            throw new TopicDoesNotExistsException("No Game Found");
        else
            return allTopics;
    }

    @Override
    public List<Topic> getAllTopicByStartsWith(String name) throws TopicDoesNotExistsException {
        List<Topic> topics = topicRepository.searchByTopicAlphabet(name);
        if(topics==null)
            throw new TopicDoesNotExistsException("No Game Found");
        else
            return topics;
    }
}
