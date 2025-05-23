package org.example.validation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.validator.constraints.Length;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Valid
public class Employee {

                  @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                private long id;

                @NotBlank(message = "name not be blank")
                @Length(min = 4, max = 50, message = "name between 4 to 50")
                private String firstName;

                @NotBlank(message = "lastname not blank")
                @Length(min = 4, max = 50, message = "lastname between 4 to 50")
                private String lastName;

                @Pattern(regexp = "[MF]", message = "Value can be either M  Or  F ")
                private String gender;

                @Length(min = 12, max = 12, message = "Adhar No Must be 12 character")
                private String adharNo;

                @Min(value = 10, message = "Minimum age should be 10")
                @Max(value = 24, message = "Maximum age should be 24")
                private int age;

                @Email(message = "Enter valid email ")
                private String email;

                @Length(min = 10, max = 10, message = "Enter 10 digitn ")
                private String mobileNo;




        public static void main(String[] args) {

                SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
                Session session = factory.openSession();

                Employee e = new Employee();//("aaaa","zzzz","F","111122222223",12,"abc@gmail.com",122222222);

                e.setFirstName("llll");
                e.setLastName("zzoooo");
                e.setGender("F");
                e.setAdharNo("123456789099");
                e.setAge(14);
                e.setEmail("abc@gmail.com");
                e.setMobileNo("1111222229");


                Transaction tx = session.beginTransaction();
                session.save(e);
                tx.commit();

                session.close();
                factory.close();

                // Validate entity  (use @Valid anotation instead of below logic )

              /*  ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
                Validator validator = validatorFactory.getValidator();

                Set<ConstraintViolation<Employee>> violations = validator.validate(e);

                if (!violations.isEmpty()) {
                        for (ConstraintViolation<Employee> violation : violations) {
                                System.out.println(violation.getPropertyPath() + ": " + violation.getMessage());
                        }
                } else {
                        Transaction tx = session.beginTransaction();
                        session.save(e);
                        tx.commit();
                        session.close();
                }*/



        }

}
