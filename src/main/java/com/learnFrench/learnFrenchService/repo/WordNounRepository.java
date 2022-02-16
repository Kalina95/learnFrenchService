package com.learnFrench.learnFrenchService.repo;

import com.learnFrench.learnFrenchService.model.WordNoun;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordNounRepository extends JpaRepository<WordNoun, Long> {
    
    
    WordNoun findWordNounById(Long id);


    void deleteWordNoundById(Long id);
}
