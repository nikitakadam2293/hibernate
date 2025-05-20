package org.example.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainOneToOne {

    public static void main(String[] args) {

        System.out.println("One to one mapping");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();


        //  Add user
        Users users = new Users();
        users.setUid(3);
        users.setName("shiva");
        users.setEmail("shia@gmail.com");


        // save cart detail

        Cart cart = new Cart();
        cart.setId(13);
        cart.setTotalAmount(1333D);

        users.setCart(cart);
        cart.setUsers(users);


        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(users);

        tx.commit();
        session.close();

    }
}
