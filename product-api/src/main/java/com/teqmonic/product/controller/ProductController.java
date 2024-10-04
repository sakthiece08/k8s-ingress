package com.teqmonic.product.controller;

import com.teqmonic.product.model.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public List<Products> getProducts() {
        return List.of(new Products(1, "Product-1", new BigDecimal(100)),
                new Products(2, "Product-2", new BigDecimal(50)),
                new Products(3, "Product-3", new BigDecimal(150)));
    }
}
