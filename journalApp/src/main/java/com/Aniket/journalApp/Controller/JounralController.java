package com.Aniket.journalApp.Controller;

import com.Aniket.journalApp.Entity.JournalEntity;
import com.Aniket.journalApp.Service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JounralController {

    @Autowired
    private JournalService journalService;

    @GetMapping
    public List<JournalEntity> showAllEntry() {
        return journalService.GetAllEntity();
    }

    @PostMapping
    public String AddNewEntry(@RequestBody JournalEntity myEntry) {
        return journalService.PostnewEntry(myEntry);
    }

    @GetMapping("/id/{myId}")
    public JournalEntity showEntryById(@PathVariable String myId) {
        return journalService.showEntryById(myId);
    }

    @DeleteMapping
    public String deleteAllEntry() {
        return journalService.deleteAllEntry();
    }

    @DeleteMapping("/id/{myId}")
    public String deleteById(@PathVariable String myId) {
        return journalService.deleteById(myId);
    }
}
