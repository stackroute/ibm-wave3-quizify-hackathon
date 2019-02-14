package com.stackroute.quizify.questionmanager.controller;

import com.stackroute.quizify.questionmanager.domain.Category;
import com.stackroute.quizify.questionmanager.exception.categoryExceptions.CategoryAlreadyExistsException;
import com.stackroute.quizify.questionmanager.exception.categoryExceptions.CategoryDoesNotExistException;
import com.stackroute.quizify.questionmanager.exception.categoryExceptions.NoCategoriesFoundException;
import com.stackroute.quizify.questionmanager.exception.categoryExceptions.NoTopicsFoundException;
import com.stackroute.quizify.questionmanager.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
@Api(description="Category Service")
public class CategoryController {
    private CategoryService categoryService;
    private ResponseEntity<?> responseEntity;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ApiOperation(value = "Get All Categories")
    @GetMapping("/categories")
    public ResponseEntity<?> getAllCategories() {
        try {
            return new ResponseEntity<List<Category>>(this.categoryService.getAllCategories(), HttpStatus.OK);
        } catch (NoCategoriesFoundException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation(value = "Add Category")
    @PostMapping("/categories/category")
    public ResponseEntity<?> addCategory(@RequestBody Category category) {
        try {
            return new ResponseEntity<Category>(this.categoryService.addCategory(category), HttpStatus.OK);
        } catch (CategoryAlreadyExistsException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @ApiOperation(value = "Update Category")
    @PutMapping("/categories/category")
    public ResponseEntity<?> updateCategory(@RequestBody Category updatedCategory) {
        try {
            return new ResponseEntity<Category>(this.categoryService.updateCategory(updatedCategory), HttpStatus.OK);
        } catch (CategoryDoesNotExistException | CategoryAlreadyExistsException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation(value = "Remove Category")
    @DeleteMapping("/categories/category/{categoryName}")
    public ResponseEntity<?> removeCategory(@PathVariable String categoryName) {
        try {
            return new ResponseEntity<Category>(this.categoryService.removeCategory(categoryName), HttpStatus.OK);
        } catch (CategoryDoesNotExistException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation(value = "Get All Topics from Category")
    @GetMapping("/categories/category/{categoryName}")
    public ResponseEntity<?> getAllTopicNames(@PathVariable String categoryName) {
        try {
            return new ResponseEntity<List<String>>(this.categoryService.getAllTopicNames(categoryName), HttpStatus.OK);
        } catch (NoTopicsFoundException | CategoryDoesNotExistException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
