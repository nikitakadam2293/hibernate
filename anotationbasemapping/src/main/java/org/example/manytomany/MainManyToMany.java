package org.example.manytomany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainManyToMany {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();

        cfg.configure("manytomanyhibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();


        Category category = new Category();
        Category category1 = new Category();

        category.setName("first");
        category1.setName("second");

        //****

        Product product = new Product();
        Product product1 = new Product();

        product.setProductName("mobile");
        product.setProductPrice(1111);

        product1.setProductName("laptop");
        product1.setProductPrice(2222);

        //****

        List<Product> pList = new ArrayList<>();
        List<Category> cList = new ArrayList<>();

        pList.add(product);
        pList.add(product1);

        cList.add(category);
        cList.add(category1);

        product.setCategory(cList);
        category.setProduct(pList);

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(product);
        session.save(product1);

        session.save(category);
        session.save(category1);


        tx.commit();
        session.close();
    }
}
