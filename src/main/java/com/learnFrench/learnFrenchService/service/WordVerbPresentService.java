package com.learnFrench.learnFrenchService.service;


import com.learnFrench.learnFrenchService.model.WordVerbPresent;
import com.learnFrench.learnFrenchService.repo.WordVerbPresentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WordVerbPresentService {

    private final WordVerbPresentRepository wordVerbPresentRepository;

    @Autowired
    public WordVerbPresentService(WordVerbPresentRepository wordVerbPresentRepository) {
        this.wordVerbPresentRepository = wordVerbPresentRepository;
    }

    public WordVerbPresent addWordVerbPresent(WordVerbPresent wordVerbPresent){return wordVerbPresentRepository.save(wordVerbPresent);}

    public WordVerbPresent updateWordVerbPresent(WordVerbPresent wordVerbPresent){return wordVerbPresentRepository.save(wordVerbPresent);}

    public WordVerbPresent findWordVerbPresentById(Long id){return wordVerbPresentRepository.findWordVerbPresentById(id);}

    public List findAllWordVerbPresent(){return wordVerbPresentRepository.findAll();}

    public void deleteWordVerbPresentById(Long id){wordVerbPresentRepository.deleteWordVerbPresentById(id);}
}
