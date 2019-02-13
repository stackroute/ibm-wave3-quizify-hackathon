package com.stackroute.seeddata;

import com.stackroute.domain.User;
import com.stackroute.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


//@Component
//@Data
//@Primary
@Configuration
public class FeedDataApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    private UserRepository userRepository;


    @Autowired
    public FeedDataApplicationListener(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
        userRepository.save(new User("admin1", "admin1", "admin1"));
        userRepository.save(new User("player1", "player1", "player1"));
        userRepository.save(new User("player2", "player2", "player2"));
        userRepository.save(new User("player3", "player3", "player3"));
    }


}
