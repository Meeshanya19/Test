package com.test.pikh.employee;

/**
 * Created by Michail on 12/8/2019.
 */
public  class Employee {
    private double ratePerHour;
    private int workDays;
    private String name;

    public Employee(double ratePerHour, int workDays,String name) {
        this.ratePerHour = ratePerHour;
        this.workDays = workDays;
        this.name = name;
    }

    public  double getSalary(){
        return ratePerHour*workDays*8;
    }

    public String getName() {
        return name;
    }
}
