package net.dushyant.journalApp.repository;

import net.dushyant.journalApp.entity.User;
import net.dushyant.journalApp.service.UserArgumentsProvider;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserRepositoryImplTests {

    @Autowired
    private  UserRepositoryImpl userRepository;

    @Test
    public void testSaveNewUser(){
        userRepository.getUserForSA();
    }

}
