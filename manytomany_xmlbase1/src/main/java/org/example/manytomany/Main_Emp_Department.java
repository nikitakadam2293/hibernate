package org.example.manytomany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main_Emp_Department {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();

        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        //************************

        Employee e = new Employee();

        e.setName("aaaa");
        e.setLastName("zzzz");
        e.setMobile("787654568");
        e.setAddress("Latur");



        Employee e1 = new Employee();
        e1.setName("pppp");
        e1.setLastName("qqqq");
        e1.setMobile("787654568");
        e1.setAddress("Satara");

        //************************
        //************************

        Department d = new Department();

        d.setName("kkkk");
        d.setStreet("m.g.road");
        d.setAddress("pune");
        d.setMobile("987098767");


        Department d1 = new Department();

        d1.setName("llll");
        d1.setStreet("m.g.road");
        d1.setAddress("nanded");
        d1.setMobile("987098767");


        List<Employee> eList = new ArrayList<>();

        eList.add(e);
        eList.add(e1);


        List<Department> dList = new ArrayList<>();
        dList.add(d);
        dList.add(d1);


        //************************
        //************************

        e.setDepartment(dList);

        d.setEmployee(eList);


        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        for(Employee emp : eList)
        {
            session.save(emp);
        }



        tx.commit();
        session.close();

    }
}
