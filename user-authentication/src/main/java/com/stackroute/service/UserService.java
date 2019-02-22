package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exceptions.UserNameNotFoundException;

import java.util.List;

public interface UserService
{
    public User saveUser(User user) throws UserNameNotFoundException; //users ADDED

    public List<User> getAllUsers();  ///RETRIEVE users

    public User findByUserIdAndPassword(String username,String password);
}
