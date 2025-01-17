package me.adeir.organizamoney.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import me.adeir.organizamoney.entities.Users;

public interface  UserRepository extends CrudRepository<Users, Object>{
    Optional<Users> findByUsername(String username);
    Optional<Users> findByEmail(String email);
}
