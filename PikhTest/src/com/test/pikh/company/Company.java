package com.test.pikh.company;

import com.test.pikh.employee.Employee;
import com.test.pikh.services.SalaryService;

import java.util.ArrayList;

/**
 * Created by Michail on 12/8/2019.
 */
public class Company {
    private String name;
    private double budget;
    private ArrayList<Employee> employees;

    public Company(String name, double budget, ArrayList<Employee> employees) {
        this.name = name;
        this.budget = budget;
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public SalaryService getSalaryService() {
        return new SalaryService();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
