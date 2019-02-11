package com.stackroute.quizify.questionmanager.service;

import com.stackroute.quizify.questionmanager.domain.Topic;
import com.stackroute.quizify.questionmanager.exception.TopicNameExistsException;
import com.stackroute.quizify.questionmanager.exception.TopicNotFoundException;
import com.stackroute.quizify.questionmanager.repository.QuestionRepository;
import com.stackroute.quizify.questionmanager.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {
    private TopicRepository topicRepository;
    private QuestionRepository questionRepository;

    @Autowired
    public TopicServiceImpl(TopicRepository topicRepository, QuestionRepository questionRepository) {
        this.topicRepository = topicRepository;
        this.questionRepository = questionRepository;
    }

    @Override
    public Topic saveTopic(Topic topic) throws TopicNameExistsException {
        if (this.topicRepository.existsByTopicName(topic.getName()))
            throw new TopicNameExistsException("Topic Name Already Exists !");
        else
            return this.topicRepository.save(topic);
    }

    @Override
    public Topic addSubTopic(String topicName, String subTopicName) throws TopicNameExistsException, TopicNotFoundException {
        return null;
    }

    @Override
    public Topic removeSubTopic(String topicName, String subTopicName) throws TopicNotFoundException {
        return null;
    }

    @Override
    public Topic deleteTopic(String topicId) throws TopicNotFoundException {
        return null;
    }

    @Override
    public Topic updateTopic(Topic updatedTopic) throws TopicNotFoundException {
        return null;
    }
}
