package com.solvd.auto_repair_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organization {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Organization(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
