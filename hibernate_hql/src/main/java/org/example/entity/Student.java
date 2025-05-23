package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id ;

    private String name;

    private String city;

   // private  Certificate certi;
}
