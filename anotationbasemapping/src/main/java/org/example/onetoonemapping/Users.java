package org.example.onetoonemapping;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Users {

    @Id
    private long uid;

    private String name;

    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Cart cart;



    public Users() {
    }

    public Users(long uid, String name, String email, Cart cart) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.cart = cart;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
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

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cart=" + cart +
                '}';
    }
}
