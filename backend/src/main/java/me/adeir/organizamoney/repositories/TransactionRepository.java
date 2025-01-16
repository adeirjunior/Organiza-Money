package me.adeir.organizamoney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.adeir.organizamoney.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Object> {

}
