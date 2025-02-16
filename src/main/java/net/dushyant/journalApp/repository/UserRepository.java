package net.dushyant.journalApp.repository;

import net.dushyant.journalApp.entity.JournalEntry;
import net.dushyant.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);

    void deleteByUserName(String username);
}
