package net.dushyant.journalApp.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class RedisTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Disabled
    @Test
    void testSendMail(){
        redisTemplate.opsForValue().set("email","gmail@email.com");
        Object name = redisTemplate.opsForValue().get("email");
        int a=1;
    }

}
