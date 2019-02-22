package com.stackroute.quizify.quizify.questionmanager.service;

import com.stackroute.quizify.quizify.questionmanager.domain.Question;
import com.stackroute.quizify.quizify.questionmanager.exception.NoQuestionFoundException;
import com.stackroute.quizify.quizify.questionmanager.exception.QuestionAlreadyExistsException;
import com.stackroute.quizify.quizify.questionmanager.exception.QuestionDoesNotExistException;
import com.stackroute.quizify.quizify.questionmanager.producer.QuestionProducer;
import com.stackroute.quizify.quizify.questionmanager.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * This "QuestionServiceImpl" Class implements all the methods declared by "QuestionService" Interface.
 *
 * Spring @Service annotation is used with classes that provide business functionalities/logics.
 */

@Service
public class QuestionServiceImpl implements QuestionService {

    /*Kafka Settings  */
    private String bootstrapServer = "localhost:9092";
    private String topicName = "question";

    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    /* The Method "addNewQuestion" saves a new document of Question in a collection,
     * and returns the Saved Question.
     * If Question ID already exist then it throws the Exception "CategoryNameAlreadyExistsException".
     */
    @Override
    public Question addNewQuestion(Question question) throws QuestionAlreadyExistsException {
        if (this.questionRepository.existsById(question.getId()))
            throw new QuestionAlreadyExistsException("Question Already Exists!");
        else
            return QuestionProducer.produce(this.questionRepository.save(question), this.bootstrapServer, this.topicName);
    }

    /*
    * The Method "updateQuestion" updates the Question Document, and returns the Updated Document.
    * If any Question not found with the question ID then it throws the exception "QuestionDoesNotExistException".
    */
    @Override
    public Question updateQuestion(Question question) throws QuestionDoesNotExistException {
        if (this.questionRepository.existsById(question.getId()))
            return QuestionProducer.produce(this.questionRepository.save(question), this.bootstrapServer, this.topicName);
        else
            throw new QuestionDoesNotExistException("Question Does Not Exist!");

    }

    /*
     * The Method "removeQuestion" removes a specific Question form the collection and will
     * return the Deleted Question.
     * If the Question doesn't exist then it throws "QuestionDoesNotExistException".
     */
    @Override
    public Question removeQuestion(Question question) throws QuestionDoesNotExistException {
        if (this.questionRepository.existsById(question.getId())) {
            this.questionRepository.delete(question);
            return QuestionProducer.produce(question, this.bootstrapServer, this.topicName);
        }
        else
            throw new QuestionDoesNotExistException("Question Does Not Exist!");
    }

    /*
     * The Method "getQuestion" fetches specific number of Questions matching a given categoryName, a given topicName
     * and a given level.
     * If no Question found then it throws the exception "NoQuestionFoundException".
     */
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

    /*
     * The Method "getAllQuestions" fetches all of the Questions matching a given categoryName and a given topicName.
     * If no Question found then it throws the exception "NoQuestionFoundException".
     */
    @Override
    public List<Question> getAllQuestions(String categoryName, String topicName) throws NoQuestionFoundException {
        List<Question> questionList = this.questionRepository.getAllQuestions(categoryName, topicName);
        if (questionList.isEmpty())
            throw new NoQuestionFoundException("No Question Found!");
        else {
            return questionList;
        }
    }

    /*
    * This "randomNumbers" is a private method for this class which Generates a List of Random Numbers
    */
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
