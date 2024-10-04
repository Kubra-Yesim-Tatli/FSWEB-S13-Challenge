package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        initializeAndTest();
    }

    public static void initializeAndTest() {
        // Healthplan nesnesi oluşturma
        Healthplan healthplan = new Healthplan(1, "A Sigorta", Plan.BASIC);
        System.out.println(healthplan);

        // Employee nesnesi oluşturma
        String[] healthPlans = new String[2];
        Employee employee = new Employee(1, "John Doe", "john@test.com", "password", healthPlans);
        employee.addHealthPlan(0, "A Sigorta");
        System.out.println(employee);

        // Company nesnesi oluşturma
        String[] developers = new String[2];
        Company company = new Company(1, "Workintech", 1000, developers);
        company.addEmployee(0, "Jane Doe");
        System.out.println(company);
    }
}
