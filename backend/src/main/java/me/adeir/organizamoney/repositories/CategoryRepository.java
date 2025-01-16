package me.adeir.organizamoney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.adeir.organizamoney.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Object> {
    
}
