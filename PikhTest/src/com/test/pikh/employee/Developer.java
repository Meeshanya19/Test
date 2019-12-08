package com.test.pikh.employee;

/**
 * Created by Michail on 12/8/2019.
 */
public class Developer extends Employee {
    private double bonuses;

    public Developer(double ratePerHour, int workDays,double bonuses, String name) {
        super(ratePerHour, workDays, name);
        this.bonuses = bonuses;
    }

    @Override
    public double getSalary(){
        return super.getSalary()+bonuses;
    }
}
