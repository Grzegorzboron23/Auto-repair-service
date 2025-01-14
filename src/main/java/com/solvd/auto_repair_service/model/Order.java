package com.solvd.auto_repair_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private int id;
    private LocalDate orderDate;
    private Customer customer;
    private List<Product> products = new ArrayList<>();

}
