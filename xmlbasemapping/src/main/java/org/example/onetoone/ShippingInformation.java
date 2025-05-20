package org.example.onetoone;

public class ShippingInformation {

        private long id;

        private String address;

        private String city;

        private String status;

        private String postalCode;

        private String deliveryDate;

        private  Orders orders;

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

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


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
