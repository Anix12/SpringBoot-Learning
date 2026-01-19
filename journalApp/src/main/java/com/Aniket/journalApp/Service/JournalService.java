package com.Aniket.journalApp.Service;


import com.Aniket.journalApp.Entity.JournalEntity;
import com.Aniket.journalApp.Repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;

    public List<JournalEntity> GetAllEntity() {
        return journalRepository.findAll();
    }

    public String PostnewEntry(JournalEntity myEntry) {
        journalRepository.save(myEntry);
        return "New Entry Saved";
    }

    public JournalEntity showEntryById(String id) {
        return journalRepository.findById(id).orElse(null);
    }

    public String deleteAllEntry() {
        journalRepository.deleteAll();
        return "All Entry Deleted";
    }

    public String deleteById(String id){
        journalRepository.deleteById(id);
        return "Delete Sucessfully for these id :"+id;
    }

}
