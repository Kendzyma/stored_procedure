package com.example.springstoredprocedure.controller;

import com.example.springstoredprocedure.dao.ProductDao;
import com.example.springstoredprocedure.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;
    @GetMapping("/findProduct")
    private List<Product> findProducts(){
        return dao.getProducts();
    }

    @GetMapping("/findProductByName/{category}")
    private List<Product> findProductsByName(@PathVariable String category){
        return dao.getProductsByName(category);
    }
}
