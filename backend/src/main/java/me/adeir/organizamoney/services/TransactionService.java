package me.adeir.organizamoney.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import me.adeir.organizamoney.entities.Transactions;
import me.adeir.organizamoney.repositories.TransactionRepository;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public List<Transactions> findAll() {
        return transactionRepository.findAll();
    }

    public Transactions add(Transactions transaction) {
        return transactionRepository.save(transaction);
    }

    public void deleteById(Long id) {
        transactionRepository.deleteById(id);
    }
}
