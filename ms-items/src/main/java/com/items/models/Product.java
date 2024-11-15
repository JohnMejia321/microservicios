package com.items.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Product {

    private Long id;
    private String name;
    private Double price;
    private LocalDate createAt;
}
