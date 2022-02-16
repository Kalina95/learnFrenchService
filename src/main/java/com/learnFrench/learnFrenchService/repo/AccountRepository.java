package com.learnFrench.learnFrenchService.repo;

import com.learnFrench.learnFrenchService.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {


    Account findAccountById(Long id);

    void deleteAccountById(Long id);
}
