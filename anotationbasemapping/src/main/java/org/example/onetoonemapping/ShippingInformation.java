package org.example.onetoonemapping;

import jakarta.persistence.*;

@Entity
public class ShippingInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String address;

    private String city;

    private String status;

    private String postalCode;

    private String deliveryDate;

    @OneToOne(mappedBy = "shippingInformation")
    private Orders order;



    public ShippingInformation() {
    }

    public ShippingInformation(long id, String address, String city, String status, String postalCode, String deliveryDate) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.status = status;
        this.postalCode = postalCode;
        this.deliveryDate = deliveryDate;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public long getId() {
        return id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "ShippingInformation{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }
}
