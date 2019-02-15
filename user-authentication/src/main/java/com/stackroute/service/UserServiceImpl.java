package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepo;

    @Autowired
    public UserServiceImpl(UserRepository repo) {
        this.userRepo = repo;
    }


    @Override
    public User findByUserIdAndPassword(String userId, String password) {
        return userRepo.findByUserIdAndPassword(userId, password);
    }


    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }


    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }



}
