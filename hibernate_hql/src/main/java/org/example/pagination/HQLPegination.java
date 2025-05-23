package org.example.pagination;


import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQLPegination {

    public static void main(String[] args) {


        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        Query q = session.createQuery("from Student");

        // implementing pagination using hibernate

        q.setFirstResult(4);
        q.setMaxResults(2);

        List<Student> list = q.list();

        for(Student st : list)
        {
            System.out.println(st.getId()+" : "+ st.getName() + " : " + st.getCity());
        }

        session.close();
        factory.close();
    }
}
