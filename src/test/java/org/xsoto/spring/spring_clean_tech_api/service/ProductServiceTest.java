package org.xsoto.spring.spring_clean_tech_api.service;

import org.xsoto.spring.spring_clean_tech_api.entity.Product;
import org.xsoto.spring.spring_clean_tech_api.repository.ProductRepository;
import org.xsoto.spring.spring_clean_tech_api.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository repository;

    @InjectMocks
    private ProductService service;

    @Test
    void testGetAllProducts() {
        // Arrange
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Gadget");
        when(repository.findAll()).thenReturn(List.of(product));

        // Act
        List<Product> result = service.getAllProducts();

        // Assert
        assertEquals(1, result.size());
        assertEquals("Test Gadget", result.get(0).getName());
    }
}