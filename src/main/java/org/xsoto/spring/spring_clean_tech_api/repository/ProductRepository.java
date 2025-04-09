package org.xsoto.spring.spring_clean_tech_api.repository;

import org.xsoto.spring.spring_clean_tech_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}