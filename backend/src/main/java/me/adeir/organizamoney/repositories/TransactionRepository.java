package me.adeir.organizamoney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.adeir.organizamoney.entities.Transactions;


public interface TransactionRepository extends JpaRepository<Transactions, Object> {

}
