package com.stackroute.userservice.seed;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Seed implements ApplicationListener<ContextRefreshedEvent> {

UserRepository userRepository;
    @Autowired
    public Seed(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        userRepository.save(new User("1122","ak123","akhila@gmail.com", "Akhila", "{c, c++, java}","F"));
        userRepository.save(new User("2244","hello1","akhil@gmail.com", "Ram", "{c, oops}","M"));




    }
}
