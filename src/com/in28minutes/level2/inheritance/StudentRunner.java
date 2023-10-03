package com.in28minutes.level2.inheritance;

public class StudentRunner {
    public static void main(String[] args) {

        Employee employee = new Employee("Ranga","Programmer");
        employee.setEmail("Ranga@email.com");
        employee.setPhoneNumber("010-2222-2222");
        employee.setEmployeeGrade((byte) 'A');

    }
}
