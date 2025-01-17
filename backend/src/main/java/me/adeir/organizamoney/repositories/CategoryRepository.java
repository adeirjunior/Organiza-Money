package me.adeir.organizamoney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.adeir.organizamoney.entities.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Object> {
    
}
