package org.example.onetoone;



public class Orders {


    private long id;

    private String status;

    private ShippingInformation shippingInformation;

    public ShippingInformation getShippingInformation() {
        return shippingInformation;
    }

   public void setShippingInformation(ShippingInformation shippingInformation) {
        this.shippingInformation = shippingInformation;
    }

    public Orders() {
    }

    public Orders(long id, String status) {
        this.id = id;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
