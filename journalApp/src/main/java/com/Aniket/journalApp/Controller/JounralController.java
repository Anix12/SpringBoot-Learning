package com.Aniket.journalApp.Controller;

import com.Aniket.journalApp.Entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JounralController {

    private Map<Long, JournalEntity> jounralEntity = new HashMap<>();

    @GetMapping
    public List<JournalEntity> getAll() {
        return new ArrayList<>(jounralEntity.values());
    }

    @PostMapping
    public boolean createEntity(@RequestBody JournalEntity myEntry) {
        jounralEntity.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntity getById(@PathVariable long myId) {
        return jounralEntity.get(myId);
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntity DeleteById(@PathVariable long myId){
        return jounralEntity.remove(myId);
    }

    @PutMapping("id/{myId}")
    public JournalEntity updateById(@PathVariable long myId, @RequestBody JournalEntity myEntry){
        return jounralEntity.put(myId, myEntry);
    }
}
