package org.example.cascade;

import org.example.entity.Address;
import org.example.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CascadeExample {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();

       Users u1= new Users();
       u1.setName("KKKK");
       u1.setEmail("KKK@GMAIL.COM");

        Address a1= new Address("pune","mgroad","mh","1111");
        Address a2= new Address("latur","mrroad","mh","1111");
        Address a3= new Address("mumbai","mmroad","mh","1111");

        List<Address> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        u1.setAddress(list);

        Transaction tx = session.beginTransaction();
        session.save(u1);

      /*  session.save(a1);
        session.save(a2);
        session.save(a3);
*/

        tx.commit();
        session.close();
        factory.close();
    }
}
