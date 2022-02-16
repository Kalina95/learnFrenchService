package com.learnFrench.learnFrenchService.service;


import com.learnFrench.learnFrenchService.model.WordNoun;
import com.learnFrench.learnFrenchService.repo.WordNounRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WordNounService {
    private final WordNounRepository wordNounRepository;


    @Autowired
    public WordNounService(WordNounRepository wordNounRepository) {
        this.wordNounRepository = wordNounRepository;
    }

    public WordNoun addWordNoun(WordNoun wordNoun){return wordNounRepository.save(wordNoun);}

    public WordNoun updateWordNoun(WordNoun wordNoun){return wordNounRepository.save(wordNoun);}

    public WordNoun findByIdWordNoun(Long id){return wordNounRepository.findWordNounById(id);}

    public List findAllWordNoun(){return wordNounRepository.findAll();}

    public void deleteWordNounById(Long id){wordNounRepository.deleteWordNoundById(id);}

}
