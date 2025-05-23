package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String city;

    private String street;

    private String state;

    private String pinCode;

    @ManyToOne
    private Users users;

    public Address( String city, String street, String state, String pinCode) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.pinCode = pinCode;
    }
}
