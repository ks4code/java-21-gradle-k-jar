package com.sahajanand.java_21_gradle_k_jar.controller;

import com.sahajanand.java_21_gradle_k_jar.entity.JournalEntry;
import com.sahajanand.java_21_gradle_k_jar.model.ProductId;
import com.sahajanand.java_21_gradle_k_jar.utils.Utils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
  private final Map<String, JournalEntry> journalEntries = new HashMap<>();

  @GetMapping
  public List<JournalEntry> getAll() {
    return new ArrayList<>(journalEntries.values());
  }

  @PostMapping
  public ResponseEntity<ProductId> createEntry(@RequestBody JournalEntry myEntry) {
    Utils.systemOutPrint("createEntry *****");

    String entryId = String.valueOf(UUID.randomUUID());
    myEntry.setId(entryId);
    journalEntries.put(entryId, myEntry);
    Utils.systemOutPrint("myEntry *****", myEntry);

    ProductId response = new ProductId(entryId);

    return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(response);
  }

  @GetMapping("id/{myId}")
  public JournalEntry getJournalEntryById(@PathVariable String myId) {
    return journalEntries.get(myId);
  }

  @DeleteMapping("id/{myId}")
  public JournalEntry deleteJournalById(@PathVariable String myId) {
    return journalEntries.remove(myId);
  }

  @PutMapping("id/{myId}")
  public JournalEntry updateJournalById(@PathVariable String myId, @RequestBody JournalEntry myEntry) {
    myEntry.setId(myId);
    journalEntries.put(myId, myEntry);
    return myEntry;
  }
}
