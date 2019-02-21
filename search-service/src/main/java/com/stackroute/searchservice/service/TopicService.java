package com.stackroute.searchservice.service;

import com.stackroute.searchservice.domain.Topic;
import com.stackroute.searchservice.exception.TopicDoesNotExistsException;

import java.util.List;

/*
 * This "TopicService" Interface is used to declare all the necessary services/methods
 * which are must be implemented by the Implementing Class (TopicServiceImpl).
 */

public interface TopicService {
    List<Topic> getAllTopicByName(String topicName) throws TopicDoesNotExistsException;
    List<Topic> getAllTopicByStartsWith(String name)throws TopicDoesNotExistsException;
}
