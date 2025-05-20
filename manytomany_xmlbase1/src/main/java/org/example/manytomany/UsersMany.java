package org.example.manytomany;

import java.util.List;

public class UsersMany {

    private long id;

    private String name;

    private String email;

    private String street;

    private String city;

    private String district;

    private List<OrdersMany> orders;

    public UsersMany() {

    }

   /* public UsersMany(long id, String name, String email, String street, String city, String district) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.street = street;
        this.city = city;
        this.district = district;
    }*/

    public UsersMany(long id, String name, String email, String street, String city, String district, List<OrdersMany> orders) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.street = street;
        this.city = city;
        this.district = district;
        this.orders = orders;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public List<OrdersMany> getOrders() {
        return orders;
    }

    public void setOrders(List<OrdersMany> orders) {
        this.orders = orders;
    }
}
