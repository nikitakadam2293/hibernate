package org.example.onetoonemapping;

import jakarta.persistence.*;

@Entity
public class Cart {

    @Id
    private long id;

    private Double totalAmount;

    @OneToOne(mappedBy ="cart")
   // @JoinColumn(name="cart")
    @Transient // it can  not create user column in cart table
    private Users users;

    public Cart() {
    }

    public Cart(long id, Double totalAmount, Users users) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.users = users;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", totalAmount=" + totalAmount +
                ", users=" + users +
                '}';
    }
}
