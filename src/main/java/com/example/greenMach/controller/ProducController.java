package com.example.greenMach.controller;

import com.example.greenMach.Service.ProductService;
import com.example.greenMach.dtos.CreateProductDTO;
import com.example.greenMach.model.Product;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducController
{
    @Autowired
    ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<Product> saveProduct(@RequestBody @Valid CreateProductDTO createProductDTO)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(createProductDTO));
    }

}
