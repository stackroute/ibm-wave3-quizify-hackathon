//package com.stackroute.quizify.questionmanager.repository;
//
//import com.stackroute.quizify.questionmanager.domain.Category;
//import com.stackroute.quizify.questionmanager.domain.User;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@DataMongoTest
//public class CategoryRepositoryTest {
//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    private Category category;
//    private List<Category> categories;
//    private List<String> topicNames;
//    private User user;
//
//    @Before
//    public void setUp() {
//        this.category = new Category();
//
//        this.category.setId("Category_ID");
//        this.category.setName("Category_Name");
//
//        this.topicNames = new ArrayList<>();
//
//        this.topicNames.add("Dummy_Topic1");
//        this.topicNames.add("Dummy_Topic2");
//        this.topicNames.add("Dummy_Topic3");
//
//        this.category.setTopicNames(this.topicNames);
//
//        this.user = new User();
//        this.user.setId("User_ID");
//        this.user.setName("User_Name");
//        this.user.setTimeStamp("1234567890");
//
//        this.category.setUser(this.user);
//
//        this.categories = new ArrayList<>();
//
//        this.categories.add(this.category);
//    }
//
//    @After
//    public void tearDown() {
//        this.categories = null;
//        this.user = null;
//        this.topicNames = null;
//        this.category = null;
//    }
//
//    @Test
//    public void testSaveCategorySuccess() {
//        Category newCategory = new Category();
//        newCategory.setId("101");
//        newCategory.setName("Sports");
//        List<String> newTopicNames = new ArrayList<>();
//        newTopicNames.add("Football");
//        newTopicNames.add("Cricket");
//        newTopicNames.add("Hockey");
//        newCategory.setTopicNames(newTopicNames);
//        newCategory.setUser(this.user);
//
//        Category savedCategory = this.categoryRepository.save(newCategory);
//        Category fetchedCategory = this.categoryRepository.findById(savedCategory.getId()).get();
//
//        assertEquals(newCategory, fetchedCategory);
//
//        System.out.println("First Test");
//    }
//
//}