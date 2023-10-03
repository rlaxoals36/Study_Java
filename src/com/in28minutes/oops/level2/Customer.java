package com.in28minutes.oops.level2;

public class Customer {
    private String name;
    private Address homeaddress;
    private Address workaddress;

    public Address getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(Address homeaddress) {
        this.homeaddress = homeaddress;
    }

    public Address getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Address workaddress) {
        this.workaddress = workaddress;
    }

    public Customer(String name, Address homeaddress) {
        this.name = name;
        this.homeaddress = homeaddress;
    }
}
