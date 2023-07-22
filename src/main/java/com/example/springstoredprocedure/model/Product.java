package com.example.springstoredprocedure.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
@Entity
@NamedStoredProcedureQueries
        ({@NamedStoredProcedureQuery(
                name = "firstProcedure",procedureName = "getProducts"),
                @NamedStoredProcedureQuery(name = "secondProcedure",procedureName = "getProductByName",
                parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "tproductName",type = String.class)})
        })
public class Product {
    @Id
    private int id;
    private String product_name;
}
