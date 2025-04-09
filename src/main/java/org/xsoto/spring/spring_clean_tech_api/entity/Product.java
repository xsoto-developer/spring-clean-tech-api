package org.xsoto.spring.spring_clean_tech_api.entity;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Data
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String category;
}