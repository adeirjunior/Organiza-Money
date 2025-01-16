package me.adeir.organizamoney.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionsController {
    @GetMapping("/")
    public String getAllTransactions() {
        return "Lista de gastos!";
    }

    @PostMapping("/")
    public String createTransaction() {
        return "Criar de gasto!";
    }
 
    @GetMapping("/{id}")
    public String getTransaction(@PathVariable String id, @RequestBody String entity) {
        //TODO: process GET request
        
        return entity;
    }

    @PutMapping("/{id}")
    public String putTransaction(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }

    @DeleteMapping("/{id}")
    public String deleteTransaction(@PathVariable String id, @RequestBody String entity) {
        //TODO: process DELETE request
        
        return entity;
    }
}
