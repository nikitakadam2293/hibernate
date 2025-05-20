package org.example.manytomany;

import java.util.List;

public class Employee {

    private  long id;

    private  String name;

    private String lastName;

    private String mobile;

    private  String address;

    private List<Department> department;

    public Employee() {
    }

    public Employee(String name, String lastName, String address, List<Department> department, String mobile, long id) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.department = department;
        this.mobile = mobile;
        this.id = id;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }
}
