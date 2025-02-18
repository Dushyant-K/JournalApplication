package net.dushyant.journalApp.repository;

import net.dushyant.journalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;


public class UserRepositoryImpl {

    @Autowired
    private MongoTemplate mongoTemplate;

    //We will use criteria for complex query(Criteria and query goes hand in hand)
    public List<User> getUserForSA(){
        Query query = new Query();
        query.addCriteria(Criteria.where("email").regex("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$"));
        query.addCriteria(Criteria.where("sentimentAnalysis").is(true));
//        query.addCriteria(Criteria.where("userName").is("Dushyant"));
//        query.addCriteria(Criteria.where("age").gte(20)); format for wirting query(It matches datatype of mongodb)
        List<User> users = mongoTemplate.find(query, User.class);
        return users;
    }
}
