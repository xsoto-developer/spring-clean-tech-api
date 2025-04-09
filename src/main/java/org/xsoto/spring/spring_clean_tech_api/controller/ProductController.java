package org.xsoto.spring.spring_clean_tech_api.controller;

import org.xsoto.spring.spring_clean_tech_api.service.ProductService;
import org.xsoto.spring.spring_clean_tech_api.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAllProducts();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping("/trending")
    public List<Product> getTrending() {
        // Simulación de productos futuristas
        Product drone = new Product();
        drone.setId(1L);
        drone.setName("Drone Quantum X");
        drone.setDescription("Drone con tecnología cuántica.");
        drone.setPrice(999.99);
        drone.setCategory("Gadgets");
        return List.of(drone);
    }
}