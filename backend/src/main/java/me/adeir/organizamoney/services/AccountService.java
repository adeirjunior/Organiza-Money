package me.adeir.organizamoney.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import me.adeir.organizamoney.entities.Account;
import me.adeir.organizamoney.repositories.AccountRepository;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account add(Account account) {
        return accountRepository.save(account);
    }

    public void deleteById(Long id) {
        accountRepository.deleteById(id);
    }
}
