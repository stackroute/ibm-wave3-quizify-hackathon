package com.stackroute.quizify.questionmanager.service;

import com.stackroute.quizify.questionmanager.domain.Topic;
import com.stackroute.quizify.questionmanager.exception.TopicNameExistsException;
import com.stackroute.quizify.questionmanager.exception.TopicNotFoundException;

public interface TopicService {
    Topic saveTopic(Topic topic) throws TopicNameExistsException;
    Topic addSubTopic(String topicName, String subTopicName) throws TopicNameExistsException, TopicNotFoundException;
    Topic removeSubTopic(String topicName, String subTopicName) throws TopicNotFoundException;
    Topic deleteTopic(String topicId) throws TopicNotFoundException;
    Topic updateTopic(Topic updatedTopic) throws TopicNotFoundException;

}
