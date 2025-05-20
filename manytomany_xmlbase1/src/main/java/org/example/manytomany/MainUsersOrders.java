package org.example.manytomany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MainUsersOrders {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        UsersMany users = new UsersMany();
        users.setName("sunita");
        users.setEmail("sunita@gmail.com");
        users.setStreet("m.g.road");
        users.setCity("pune");
        users.setDistrict("Pune");


        UsersMany users1 = new UsersMany();
        users1.setName("nikita");
        users1.setEmail("nikita@gmail.com");
        users1.setStreet("m.y.road");
        users1.setCity("pune");
        users1.setDistrict("Pune");


        List<UsersMany> uList = new ArrayList<>();
        uList.add(users);
        uList.add(users1);


        //****************
        OrdersMany orders = new OrdersMany();

        orders.setStatus("pending");
        orders.setStartDate(LocalDateTime.of(1111,11,11,0,0));
        orders.setShippingDate(LocalDateTime.of(2222,2,2,9,8));


        OrdersMany orders1 = new OrdersMany();

        orders1.setStatus("pending");
        orders1.setStartDate(LocalDateTime.of(4444,4,4,0,0));
        orders1.setShippingDate(LocalDateTime.of(5555,5,5,9,8));

        List<OrdersMany> oList = new ArrayList<>();

        oList.add(orders);
        oList.add(orders1);



        orders.setUsers(uList);
       // orders1.setUsers(uList);

        users.setOrders(oList);
     //   users1.setOrders(oList);


        //****************


        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();


   //    session.save(uList);
//        session.save(users1);

 //       session.save(oList);
//        session.save(orders1);


        for (UsersMany user : uList) {
            session.save(user);  //
        }



        tx.commit();
        session.close();


    }
}
