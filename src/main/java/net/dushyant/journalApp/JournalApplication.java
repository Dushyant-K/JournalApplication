package net.dushyant.journalApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;


//@SpringBootApplication-> 1.Configuration(Beans making at methods), 2.Auto-Configuration(Automatically configures properties of dependency)
// 3.Automatic component Scanning(Beans in base package)
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
public class JournalApplication {

    public static void main(String[] args) {
        SpringApplication.run(JournalApplication.class, args);
    }

    @Bean
    public PlatformTransactionManager add(MongoDatabaseFactory dbFactory){
        return new MongoTransactionManager(dbFactory);
    }

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

}
//PlatformTransactionManager
//MongoTransactionManager(Implementation)