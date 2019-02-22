package com.stackroute.searchservice.controller;

import com.stackroute.searchservice.domain.Topic;
import com.stackroute.searchservice.exception.TopicAlreadyExistsException;
import com.stackroute.searchservice.exception.TopicDoesNotExistsException;
import com.stackroute.searchservice.service.TopicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Api(description="Search by Topic")
public class TopicController {
    private TopicService topicService;
    private ResponseEntity<?> responseEntity;

    @Autowired
    public TopicController(TopicService topicService){
        this.topicService = topicService;
    }

//    @ApiOperation(value = "Search Topic By Name")
//    @GetMapping("/search/{topicName}")
//    public ResponseEntity<?> searchTopicByName(@PathVariable String topicName){
//        try {
//            return new ResponseEntity<List<Topic>>(topicService.getAllTopicByName(topicName), HttpStatus.OK);
//        }
//        catch (TopicDoesNotExistsException e)
//        {
//            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
//        }
//    }

    @ApiOperation(value = "Save Genre")
    @PostMapping
    public ResponseEntity<?> saveTopic(@RequestBody Topic topic){
        try
        {
            return new ResponseEntity<Topic>(topicService.saveTopic(topic), HttpStatus.OK);
        }
        catch (TopicAlreadyExistsException e)
        {
            return new ResponseEntity<String >(e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

    @ApiOperation(value = "Search Topic By Starts With")
    @GetMapping("/search/{topicName}")
    public ResponseEntity<?>searchTopicByStartsWith(@PathVariable String topicName){
        try {
            return new ResponseEntity<List<Topic>>(topicService.getAllTopicByStartsWith(topicName), HttpStatus.OK);
        }
        catch (TopicDoesNotExistsException e)
        {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
