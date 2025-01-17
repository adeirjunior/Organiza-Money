package me.adeir.organizamoney.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import me.adeir.organizamoney.entities.Accounts;
import me.adeir.organizamoney.services.AccountService;


@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountsController {
    private final AccountService accountService;
    @GetMapping("/")
    public List<Accounts> getAllAccounts() {
        return accountService.findAll();
    }

    @PostMapping("/")
    public String createAccount() {
        return "Criar de gasto!";
    }

    @GetMapping("/{id}")
    public String getAccount(@PathVariable String id, @RequestBody String entity) {
        //TODO: process GET request
        
        return entity;
    }

    @PutMapping("/{id}")
    public String putAccount(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable String id, @RequestBody String entity) {
        //TODO: process DELETE request
        
        return entity;
    }
}
