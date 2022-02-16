package com.learnFrench.learnFrenchService.resource;


import com.learnFrench.learnFrenchService.model.WordNoun;
import com.learnFrench.learnFrenchService.service.WordNounService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/WordNoun")
public class WordNounRestController {

    private final WordNounService wordNounService;

    public WordNounRestController(WordNounService wordNounService) {
        this.wordNounService = wordNounService;
    }

    @PostMapping("/add")
    public ResponseEntity<WordNoun> addWordNoun(@RequestBody WordNoun wordNoun){
        WordNoun newWordNoun = wordNounService.addWordNoun(wordNoun);
        return new ResponseEntity<WordNoun>(newWordNoun, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<WordNoun> updateWordNoun(@RequestBody WordNoun wordNoun){
        WordNoun updatedWordNoun = wordNounService.updateWordNoun(wordNoun);
        return new ResponseEntity<WordNoun>(updatedWordNoun, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<WordNoun> getWordNounById(@PathVariable("id") Long id){
        WordNoun getWordNounById = wordNounService.findByIdWordNoun(id);
        return new ResponseEntity<WordNoun>(getWordNounById, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<WordNoun>> getAllWordNouns(){
        List<WordNoun> allWordNouns = wordNounService.findAllWordNoun();
        return new ResponseEntity<List<WordNoun>>(allWordNouns, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteWordNoun(@PathVariable("id") Long id){
        wordNounService.deleteWordNounById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
