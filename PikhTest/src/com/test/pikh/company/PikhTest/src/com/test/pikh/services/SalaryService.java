package com.test.pikh.services;

import com.test.pikh.company.Company;
import com.test.pikh.employee.Employee;

/**
 * Created by Michail on 12/8/2019.
 */
public class SalaryService {

    public void pay(Company company) {
        double budget = company.getBudget();
        double employeeSalary;
        try {
            for (Employee employee : company.getEmployees()) {
                employeeSalary = employee.getSalary();
                if (budget > employeeSalary) {
                    budget = budget - employeeSalary;
                    System.out.println("Company " + company.getName() + " pay " + employeeSalary + " dollars to "
                            + employee.getName());
                } else {
                    System.out.println("Budget is small,the salaries are not paid to all employees");
                }
            }

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
