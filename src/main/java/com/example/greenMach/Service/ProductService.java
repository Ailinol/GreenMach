package com.example.greenMach.Service;

import com.example.greenMach.dtos.CreateProductDTO;
import com.example.greenMach.model.Product;
import com.example.greenMach.repositories.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    //Metodo para salvar productos
    public Product saveProduct(CreateProductDTO createProductDTO)
    {
        var product = new Product();
        BeanUtils.copyProperties(createProductDTO, product);
        return productRepository.save(product);
    }
}
