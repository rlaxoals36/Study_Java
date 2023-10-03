package com.in28minutes.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person{
    private String title;
    private String employer;
    private byte employeeGrade;
    private BigDecimal salary;


    public Employee(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public byte getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(byte employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString() {
        return title+" # "+employer+" # "+employeeGrade+" # "+super.toString();
    }
}
