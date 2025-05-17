package com.api.project.repository;

import com.api.project.domain.Category;
import com.api.project.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Long countAllByCategory(Category category);
}
