package com.in28minutes.oops.level2;

public class CustomerRunner {
    public static void main(String[] args) {

        Address address = new Address("line1","seoul","50023");
        Customer customer = new Customer("Ranga",address);

        Address workaddress = new Address("line1","seoul","50023");
        customer.setWorkaddress(workaddress);

    }
}
