package com.stackroute.quizify.questionmanager.repository;

import com.stackroute.quizify.questionmanager.domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
//    @Query("{ name: { $regex: '?0', $options: 'i'} }")
    boolean existsByName(String categoryName);
    boolean existsById(String categoryId);
    Category getCategoryByName(String categoryName);
}
