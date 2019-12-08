package com.test.pikh;

import com.test.pikh.company.Company;
import com.test.pikh.employee.Developer;
import com.test.pikh.employee.Manager;
import com.test.pikh.services.SalaryService;

import java.util.ArrayList;

/**
 * Created by Michail on 12/8/2019.
 */
public class Application {
    public static void main(String[] args) {
        Developer developer = new Developer(10, 20, 500,"Jack");
        Manager manager = new Manager(12, 10, "Sara");

        Company company = new Company("Nestle", 2200, new ArrayList<>());

        company.addEmployee(developer);
        company.addEmployee(manager);

        SalaryService salaryService = company.getSalaryService();
        salaryService.pay(company);
    }
}
