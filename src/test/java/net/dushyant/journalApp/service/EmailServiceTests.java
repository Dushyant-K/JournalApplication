package net.dushyant.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail(){
        emailService.sendEMail("dushyantv010@gmail.com","Testing java mail sender","Hi, aap kaise hain ?");
    }
}
