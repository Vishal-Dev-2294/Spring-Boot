package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> JournalEntries = new HashMap<>(); // isme hi hamra id and shabkuch araha hai

    @GetMapping
    public List<JournalEntry> getAll(){ // Get pe ya chalega
        return new ArrayList<>(JournalEntries.values());
    }

    @PostMapping
    public boolean createEntry (@RequestBody JournalEntry myEntry){ // Post pe ye chalega
        JournalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId){
        return JournalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable long myId){
        return JournalEntries.remove(myId);
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateJournalEntryById(@PathVariable long myId , @RequestBody JournalEntry myEntry){
            return JournalEntries.put(myId , myEntry);
    }

}
