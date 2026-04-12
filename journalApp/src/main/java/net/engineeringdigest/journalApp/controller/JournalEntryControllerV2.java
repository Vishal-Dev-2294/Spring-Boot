package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Journal")
public class JournalEntryControllerV2 {

    @GetMapping
    public List<JournalEntry> getAll(){ // Get pe ya chalega
        return null;
    }

    @PostMapping
    public boolean createEntry (@RequestBody JournalEntry myEntry){ // Post pe ye chalega

        return null;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId){
        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable long myId){
        return null;
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateJournalEntryById(@PathVariable long myId , @RequestBody JournalEntry myEntry){
        return null;
    }

}
