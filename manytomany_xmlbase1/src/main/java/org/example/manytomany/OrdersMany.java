package org.example.manytomany;

import java.time.LocalDateTime;
import java.util.List;

public class OrdersMany {

    private long id;

    private String status;

    private LocalDateTime startDate;

    private  LocalDateTime shippingDate;

    private List<UsersMany> users;

    public OrdersMany() {

    }

  /*  public OrdersMany(long id, String status, LocalDateTime startDate, LocalDateTime shippingDate) {
        this.id = id;
        this.status = status;
        this.startDate = startDate;
        this.shippingDate = shippingDate;
    }*/

    public OrdersMany(long id, String status, LocalDateTime startDate, LocalDateTime shippingDate, List<UsersMany> users) {
        this.id = id;
        this.status = status;
        this.startDate = startDate;
        this.shippingDate = shippingDate;
        this.users = users;
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

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDateTime shippingDate) {
        this.shippingDate = shippingDate;
    }

    public List<UsersMany> getUsers() {
        return users;
    }

    public void setUsers(List<UsersMany> users) {
        this.users = users;
    }
}
