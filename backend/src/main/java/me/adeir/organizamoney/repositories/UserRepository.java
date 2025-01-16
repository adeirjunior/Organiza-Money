package me.adeir.organizamoney.repositories;

import org.springframework.data.repository.CrudRepository;

import me.adeir.organizamoney.entities.User;

public interface  UserRepository extends CrudRepository<User, Object>{
    
}
