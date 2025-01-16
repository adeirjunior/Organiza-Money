package me.adeir.organizamoney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.adeir.organizamoney.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Object> {
    
}
