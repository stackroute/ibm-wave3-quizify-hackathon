package com.stackroute.quizify.recommendationservice.service;

import com.stackroute.quizify.recommendationservice.domain.User;
import com.stackroute.quizify.recommendationservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    InterestsService interestsService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAllNodes();
    }

    @Override
    public User getone(long userId) {
        return userRepository.getNode(userId);
    }

    @Override
    public User create(User user) {
        long id=user.getUserId();
        String name=user.getUserName();
        String gender=user.getGender();
        List<String> interests=user.getInterests();
        interestsService.getInterests(user);
        return userRepository.createNode(id,name,gender,interests);
    }
    @Override
    public User delete(long userId) {
        return userRepository.deleteNode(userId);
    }

    @Override
    public User update(User user) {
        long id=user.getUserId();
        String name=user.getUserName();
        String gender=user.getGender();
        return userRepository.updateNode(id,name,gender);
    }
}
