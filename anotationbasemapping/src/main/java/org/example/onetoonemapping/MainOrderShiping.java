package org.example.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainOrderShiping {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Orders order = new Orders();
        order.setStatus("tranform");

        /// /////////////

        ShippingInformation  shippingInformation = new ShippingInformation();
        shippingInformation.setAddress("mumbai");
        shippingInformation.setCity("Maharashtra");
        shippingInformation.setStatus("pending");
        shippingInformation.setPostalCode("23");
        shippingInformation.setDeliveryDate("3-05-25");
        shippingInformation.setOrder(order);


        order.setShippingInformation(shippingInformation);


        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(order);

        tx.commit();

        session.close();


    }
}
