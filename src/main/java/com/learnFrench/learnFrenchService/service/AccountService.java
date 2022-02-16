package com.learnFrench.learnFrenchService.service;


import com.learnFrench.learnFrenchService.model.Account;
import com.learnFrench.learnFrenchService.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account addAccount(Account account){
        return accountRepository.save(account);
    }

    public Account updateAccount(Account account){
        return accountRepository.save(account);
    }

    public Account findAccountById(Long id){
        return accountRepository.findAccountById(id);
    }

    public List findAllAccounts(){
        return accountRepository.findAll();
    }

    public void deleteAccount(Long id){
        accountRepository.deleteAccountById(id);
    }
}
