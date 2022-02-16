package com.learnFrench.learnFrenchService.repo;

import com.learnFrench.learnFrenchService.model.WordVerbPresent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordVerbPresentRepository extends JpaRepository<WordVerbPresent, Long> {

    WordVerbPresent findWordVerbPresentById(Long id);

    void deleteWordVerbPresentById(Long id);
}
