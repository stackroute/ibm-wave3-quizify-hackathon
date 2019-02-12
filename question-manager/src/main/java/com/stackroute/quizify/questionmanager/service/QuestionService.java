package com.stackroute.quizify.questionmanager.service;

import com.stackroute.quizify.questionmanager.domain.Question;

public interface QuestionService {
    Question[] addQuestionsIntoTopic(String topicId, Question[] questions);
    Question[] updateQuestionsOfTopic(String topicId, Question[] updatedQuestions);
    Question[] deleteQuestionsFromTopic(String topicId, String[] questionIds);
}
