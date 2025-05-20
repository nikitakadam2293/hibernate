package org.example.onetomany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainOrdersUsers {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();

        cfg.configure("onetomanyhibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        // save order

        Orders orders = new Orders();
        orders.setStatus("approve");

        Orders orders1 = new Orders();
        orders1.setStatus("pending");

        List<Orders> list = new ArrayList<>();
        list.add(orders);

        /// ////////////////////////////////////
        Users users = new Users();

        users.setName("XXXX");
        users.setEmail("xxxx@gmail.com");
        orders.setUsers(users);


        //*************

        users.setOrders(list);


        // Save Address

        Address address = new Address();
        address.setCity("Pune");
        address.setStreet("m.g.road");
        address.setState("mh");
        address.setPinCode("1111");
        address.setUsers(users);
        List<Address> list1 = new ArrayList<>();
        list1.add(address);




        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(users);
        session.save(address);
      //  session.save(orders);
        //session.save(orders1);



        tx.commit();
        session.close();




    }
}
