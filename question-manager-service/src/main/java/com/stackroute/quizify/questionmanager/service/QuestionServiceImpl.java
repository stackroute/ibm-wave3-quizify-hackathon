package com.stackroute.quizify.questionmanager.service;

import com.stackroute.quizify.questionmanager.domain.Question;
import com.stackroute.quizify.questionmanager.exception.NoQuestionFoundException;
import com.stackroute.quizify.questionmanager.exception.QuestionAlreadyExistsException;
import com.stackroute.quizify.questionmanager.exception.QuestionDoesNotExistException;
import com.stackroute.quizify.questionmanager.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question addNewQuestion(Question question) throws QuestionAlreadyExistsException {
        if (this.questionRepository.existsById(question.getId()))
            throw new QuestionAlreadyExistsException("Question Already Exists!");
        else
            return this.questionRepository.save(question);
    }

    @Override
    public Question updateQuestion(Question question) throws QuestionDoesNotExistException {
        if (this.questionRepository.existsById(question.getId()))
            throw new QuestionDoesNotExistException("Question Does Not Exist!");
        else
            return this.questionRepository.save(question);
    }

    @Override
    public Question removeQuestion(Question question) throws QuestionDoesNotExistException {
        if (this.questionRepository.existsById(question.getId()))
            throw new QuestionDoesNotExistException("Question Does Not Exist!");
        else {
            this.questionRepository.delete(question);
            return question;
        }
    }

    @Override
    public List<Question> getQuestion(String categoryName, String topicName, String level, int numOfQuestions) throws NoQuestionFoundException {
        List<Question> questionList = this.questionRepository.getQuestions(categoryName, topicName, level);
        if (questionList.isEmpty())
            throw new NoQuestionFoundException("No Question Found!");
        else {
            List<Question> resultList = new ArrayList<>();
            List<Integer> randomList = randomNumbers(questionList.toArray().length, numOfQuestions);

            for (int i: randomList)
                resultList.add(questionList.get(i));

            return resultList;
        }
    }

    @Override
    public List<Question> getAllQuestions(String categoryName, String topicName) throws NoQuestionFoundException {
        List<Question> questionList = this.questionRepository.getAllQuestions(categoryName, topicName);
        System.out.println(questionList);
        if (questionList.isEmpty())
            throw new NoQuestionFoundException("No Question Found!");
        else {
            return questionList;
        }
    }

    private List<Integer> randomNumbers(int maxRange, int totalNumbers) {
        List<Integer> result = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < maxRange; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
        for(int i =0; i < totalNumbers; i++)
            result.add(numbers.get(i));
        return result;
    }

}
