package com.example.springstoredprocedure.dao;

import com.example.springstoredprocedure.model.Product;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDao {
    @Autowired
    private EntityManager em;
    public List<Product> getProducts(){
        return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
    }
    public List<Product> getProductsByName(String product_name){
        return em.createNamedStoredProcedureQuery("secondProcedure")
                .setParameter("tproductName",product_name)
                .getResultList();
    }
}
