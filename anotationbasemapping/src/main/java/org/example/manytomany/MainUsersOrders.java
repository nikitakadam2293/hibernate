package org.example.manytomany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainUsersOrders {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("manytomanyhibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Users users = new Users();
        Users users1 = new Users();

        users.setName("Sunita");
        users.setEmail("sunita@gmail.com");

        users1.setName("Nikita");
        users1.setEmail("nikita@gmail.com");

        // ****

        Orders orders = new Orders();
        Orders orders1 = new Orders();

        orders.setStatus("approve");
        orders1.setStatus("++++");

        List<Users> uList = new ArrayList<>();
        uList.add(users);
        uList.add(users1);

        List<Orders> oList = new ArrayList<>();
        oList.add(orders);
        oList.add(orders1);


        users.setOrders(oList);
        orders.setUsers(uList);

        Session session = factory.openSession();

        Transaction tx= session.beginTransaction();

        session.save(users);
        session.save(users1);

        session.save(orders);
        session.save(orders1);


        tx.commit();
        session.close();





    }
}
