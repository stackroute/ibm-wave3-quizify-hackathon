package com.stackroute.service;

import com.stackroute.domain.User;

import java.util.List;

public interface UserService
{
    public User saveUser(User user); //users ADDED

    public List<User> getAllUsers();  ///RETRIEVE users

    public User findByUserIdAndPassword(String userId,String password);
}
