package org.example.onetoone;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOrdersAndShipping {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();

        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

           // add Orders

        Orders orders = new Orders();
        orders.setId(3);
        orders.setStatus("pending");


        ShippingInformation shippingInformation = new ShippingInformation();
        shippingInformation.setId(3);
        shippingInformation.setAddress("shivaji nagar");
        shippingInformation.setCity("pune");
        shippingInformation.setStatus("pending");
        shippingInformation.setPostalCode("2222");
        shippingInformation.setDeliveryDate("2-2-1111");


        orders.setShippingInformation(shippingInformation);
        shippingInformation.setOrders(orders);

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(orders);

        tx.commit();
        session.close();

    }
}
