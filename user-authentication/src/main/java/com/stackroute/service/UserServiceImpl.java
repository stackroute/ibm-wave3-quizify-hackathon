package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exceptions.UserNameNotFoundException;
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
    public User saveUser(User user)throws UserNameNotFoundException
    {
        if(userRepo.existsById(user.getUserId())){
            throw new UserNameNotFoundException("User already exists!!");

        }
        User userSaved = userRepo.save(user);
        return userSaved;

    }


    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }



}
