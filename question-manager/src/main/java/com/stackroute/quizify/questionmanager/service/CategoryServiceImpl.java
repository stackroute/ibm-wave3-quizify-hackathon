package com.stackroute.quizify.questionmanager.service;

import com.stackroute.quizify.questionmanager.domain.Category;
import com.stackroute.quizify.questionmanager.exception.categoryExceptions.*;
import com.stackroute.quizify.questionmanager.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<String> getAllTopicNames(String categoryName) throws NoTopicsFoundException, CategoryDoesNotExistException {
        List<String> topicNameList = null;
        if (this.categoryRepository.existsByName(categoryName)) {
            topicNameList = this.categoryRepository.getCategoryByName(categoryName).getTopicNames();
            if (topicNameList.isEmpty())
                throw new NoTopicsFoundException("No Topics Found in Category : " + categoryName);
            else
                return topicNameList;
        }
        else
            throw new CategoryDoesNotExistException("Category " + categoryName + " Not Found !");
    }

//    @Override
//    public Category addTopicNameIntoCategory(String categoryName, String topicName) throws TopicAlreadyExistsException, CategoryDoesNotExistException {
//        Category category = null;
//        List<String> topicNameList = null;
//        if (this.categoryRepository.existsByName(categoryName)) {
//            category = this.categoryRepository.getCategoryByName(categoryName);
//            topicNameList = category.getTopicNames();
//            if (topicNameList.contains(topicName.toLowerCase()))
//                throw new TopicAlreadyExistsException("Topic " + topicName + " Already Exists !");
//            else {
//                topicNameList.add(topicName.toLowerCase());
//                category.setTopicNames(topicNameList);
//                return category;
//            }
//        }
//        else
//            throw new CategoryDoesNotExistException("Category " + categoryName + " Not Found !");
//    }
//
//    @Override
//    public Category removeTopicNameFromCategory(String categoryName, String topicName) throws TopicDoesNotExistsException, CategoryDoesNotExistException {
//        Category category = null;
//        List<String> topicNameList = null;
//        if (this.categoryRepository.existsByName(categoryName)) {
//            category = this.categoryRepository.getCategoryByName(categoryName);
//            topicNameList = category.getTopicNames();
//            if (!topicNameList.contains(topicName.toLowerCase()))
//                throw new TopicDoesNotExistsException("Topic " + topicName + " Does Not Exist !");
//            else {
//                topicNameList.remove(topicName.toLowerCase());
//                category.setTopicNames(topicNameList);
//                return category;
//            }
//        }
//        else
//            throw new CategoryDoesNotExistException("Category " + categoryName + " Not Found !");
//    }


    @Override
    public List<Category> getAllCategories() throws NoCategoriesFoundException {
        List<Category> categories = this.categoryRepository.findAll();
        if (categories.isEmpty())
            throw new NoCategoriesFoundException("No Category Found !");
        else
            return categories;
    }

    @Override
    public Category addCategory(Category category) throws CategoryAlreadyExistsException {
        if (this.categoryRepository.existsByName(category.getName()))
            throw new CategoryAlreadyExistsException("Category Name " + category.getName() + " Already Exists !");
        else
            return this.categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category updatedCategory) throws CategoryDoesNotExistException, CategoryAlreadyExistsException {
        if (this.categoryRepository.existsById(updatedCategory.getId()))
            if (this.categoryRepository.existsByName(updatedCategory.getName()))
                throw new CategoryAlreadyExistsException("Category Name " + updatedCategory.getName() + " Already Exists !");
            else
                return this.categoryRepository.save(updatedCategory);
        else
            throw new CategoryDoesNotExistException("Category " + updatedCategory.getName() + " Does Not Exist !");
    }

    @Override
    public Category removeCategory(String categoryName) throws CategoryDoesNotExistException {
        if (!this.categoryRepository.existsByName(categoryName))
            throw new CategoryDoesNotExistException("Category " + categoryName + " Does Not Exist !");
        else {
            Category category = this.categoryRepository.getCategoryByName(categoryName);
            this.categoryRepository.delete(category);
            return category;
        }
    }
}
