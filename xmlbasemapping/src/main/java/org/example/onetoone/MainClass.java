package org.example.onetoone;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

    public static void main(String[] args) {

        SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Users users = new Users();
        users.setId(8);
        users.setName("dada");
        users.setEmail("dada@gmail.com");


        Cart cart = new Cart();
        cart.setId(10);
        cart.setTotalAmount(10D);

        users.setCart(cart);

        cart.setUsers(users);

        Session session= factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(users);


        ///// ///
           // session.save(users);
        /// ///
        tx.commit();
        session.close();

        factory.close();

    }
}
