package com.learnFrench.learnFrenchService.resource;


import com.learnFrench.learnFrenchService.model.WordVerbPresent;
import com.learnFrench.learnFrenchService.service.WordVerbPresentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/VerbPresent")
public class WordVerbPresentRestController {
    private final WordVerbPresentService wordVerbPresentService;

    public WordVerbPresentRestController(WordVerbPresentService wordVerbPresentService) {
        this.wordVerbPresentService = wordVerbPresentService;
    }

    @PostMapping("/add")
    public ResponseEntity<WordVerbPresent> addWordVerbPresent(@RequestBody WordVerbPresent wordVerbPresent){
        WordVerbPresent newWordVerbPresent = wordVerbPresentService.addWordVerbPresent(wordVerbPresent);
        return new ResponseEntity<WordVerbPresent>(newWordVerbPresent, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<WordVerbPresent> updateWordVerbPresent(@RequestBody WordVerbPresent wordVerbPresent){
        WordVerbPresent updatedWordVerbPresent = wordVerbPresentService.updateWordVerbPresent(wordVerbPresent);
        return new ResponseEntity<WordVerbPresent>(updatedWordVerbPresent, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<WordVerbPresent> findWordVerbPresentById(@PathVariable("id") Long id){
        WordVerbPresent foundWordVerbPresent = wordVerbPresentService.findWordVerbPresentById(id);
        return new ResponseEntity<WordVerbPresent>(foundWordVerbPresent, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<WordVerbPresent>> findAllWordsVerbPresent(){
        List<WordVerbPresent> allWordsVerbPresent = wordVerbPresentService.findAllWordVerbPresent();
        return new ResponseEntity<List<WordVerbPresent>>(allWordsVerbPresent, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteWordVerbPresent(@PathVariable("id") Long id){
        wordVerbPresentService.deleteWordVerbPresentById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
