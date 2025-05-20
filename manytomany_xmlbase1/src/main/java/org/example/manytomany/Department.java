package org.example.manytomany;

import java.util.List;

public class Department {

    private long id;

    private String name;

    private String street;

    private String address;

    private String mobile;

    private List<Employee> employee;

    public Department() {

    }

    public Department(long id, String name, String street, String address, String mobile, List<Employee> employee) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.address = address;
        this.mobile = mobile;
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
