package net.dushyant.journalApp.repository;

import net.dushyant.journalApp.entity.JournalEntry;
import net.dushyant.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);//Query Method DSL(Have to see documentation bcz there is no auto-
    //completion and spring boot resolves the query listed in documentation like findByUserNameAndEmail

    void deleteByUserName(String username);
}
