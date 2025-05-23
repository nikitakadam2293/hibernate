package org.example.secondlevelcache;


import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session1 = factory.openSession();
// first l cache

        Student student1 = session1.get(Student.class, 1);
        System.out.println(student1);

        session1.close();

        Session session2 = factory.openSession();
//second l cache

        Student student2 = session2.get(Student.class, 1);
        System.out.println(student2);

        session2.close();

    }
}
