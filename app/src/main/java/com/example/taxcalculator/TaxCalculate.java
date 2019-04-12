package com.example.taxcalculator;


public class TaxCalculate {

    private double salary;
    double firstSalary, secondSalary, thirdSalary, total;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateTax(){
        if(this.getSalary() <= 200000){
            total = this.getSalary()*0.01;
        }
        else if(this.getSalary() >= 200000 && this.getSalary() <= 350000){
            firstSalary = 2000;
            secondSalary = (this.getSalary() - 200000)*0.15;

            total = (firstSalary + secondSalary);
        }
        else if(this.getSalary() >350000){
            firstSalary = 2000;
            secondSalary = 22500;
            thirdSalary = (this.getSalary() - 350000) *0.25;
            total = (firstSalary + secondSalary+thirdSalary);
        }
        return total;
    }

}
