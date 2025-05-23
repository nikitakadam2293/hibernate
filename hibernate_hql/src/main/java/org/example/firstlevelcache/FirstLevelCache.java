package org.example.firstlevelcache;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache {

    public static void main(String[] args) {

        SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        Student s =  new Student();
        s.setName("nikita");
        s.setCity("pune");

        session.save(s);



        Student student = session.get(Student.class,1);
        System.out.println(student);

        System.out.println("WORKING SOMETHING ");

        Student student1 = session.get(Student.class,1);
        System.out.println(student1);

        System.out.println(session.contains(student1));  // true

        session.close();


    }
}
