package com.Aniket.journalApp.Repository;

import com.Aniket.journalApp.Entity.JournalEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepository extends MongoRepository<JournalEntity, String> {
}
