package com.stackroute.quizify.questionmanager.service;

import com.stackroute.quizify.questionmanager.domain.Category;
import com.stackroute.quizify.questionmanager.exception.categoryExceptions.*;

import java.util.List;

public interface CategoryService {

//    Category addTopicNameIntoCategory(String categoryName, String topicName) throws TopicAlreadyExistsException, CategoryDoesNotExistException;
//    Category removeTopicNameFromCategory(String categoryName, String topicName) throws TopicDoesNotExistsException, CategoryDoesNotExistException;

    List<Category> getAllCategories() throws NoCategoriesFoundException;
    Category addCategory(Category category) throws CategoryAlreadyExistsException;
    Category updateCategory(Category updatedCategory) throws CategoryDoesNotExistException, CategoryAlreadyExistsException;
    Category removeCategory(String categoryName) throws CategoryDoesNotExistException;
    List<String> getAllTopicNames(String categoryName) throws NoTopicsFoundException, CategoryDoesNotExistException;

}
