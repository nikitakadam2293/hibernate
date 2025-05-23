/*
package org.example.sqlquery;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class SQLExample {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();

        String q = "select * from student";

        NativeQuery nq= session.createSQLQuery(q);

        List<Student> list = nq.list();

        for(Student student: list)
        {
            System.out.println(student.getName() +" : " + student.getCity() + " : " );
        }

        session.close();
        factory.close();
    }
}
*/
package org.example.sqlquery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class SQLExample {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        try {
            session.beginTransaction();

            String q = "SELECT * FROM student";

            NativeQuery<Object[]> nq = session.createNativeQuery(q);

            List<Object[]> rows = nq.getResultList();

            for (Object[] row : rows) {
                for (Object col : row) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
