package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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

    @OneToMany(mappedBy = "users",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Address> address;







}
