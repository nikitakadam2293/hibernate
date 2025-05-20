package org.example.onetomany;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Orders {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY) //

    private long id;

    private String status;

    @ManyToOne
    private  Users users;

    public Orders(Users users) {
        this.users = users;
    }
}
