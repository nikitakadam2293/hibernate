package org.example.onetomany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.example.onetomany.Orders;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Users {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;

    private String name;

    private String email;



// one user many order

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Orders> orders;

    public Users(List<Orders> orders) {
        this.orders = orders;
    }

    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private List<Address> address;







}
