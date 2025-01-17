package me.adeir.organizamoney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.adeir.organizamoney.entities.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, Object> {
    
}
