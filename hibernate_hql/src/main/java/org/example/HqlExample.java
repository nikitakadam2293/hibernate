package org.example;


import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class HqlExample {

    public static void main(String[] args) {

        Configuration  cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();


        Student student1 = new Student();
        student1.setName("sunita");
        student1.setCity("Pune");
        session.save(student1);

        Student student2 = new Student();
        student2.setName("nikita");
        student2.setCity("Pune");
        session.save(student2);

        Student student3 = new Student();
        student3.setName("shivraj");
        student3.setCity("Pune");
        session.save(student3);


      //  String query = "from Student where name='sunita'";

        String query = "from Student where name=:x";

        Query q = (Query) session.createQuery(query);

        q.setParameter("x","Pune");

        // single result (unique)
        // multiple result  -  list

        //  single result = q.uniqueResult()

        //  multiple result

        List<Student> list =  q.list();

        for(Student s: list)
        {
            System.out.println(s.getCity()+s.getName() + " : " + s.getId() +" : " );
        }

        System.out.println("=====================================");
        Transaction tx = session.beginTransaction();

        //  DELETE QUERY

        Query q2 = session.createQuery("delete from Student s where s.name=:c");

        q2.setParameter("c","nikita");

        int r=  q2.executeUpdate();
        System.out.println("Deleted ....");
        System.out.println(r);


        //  UPDATE QUERY
        Query q3 = session.createQuery("update Student set city=:c where name=:n");

        q3.setParameter("c","AHMEDNAGAR");
        q3.setParameter("n","sunita");
        int r2= q3.executeUpdate();

        System.out.println(r2 + "objects updated ");


        /// ///  execute join query

      Query q4=  session.createQuery("Select u.name ,u.email, a.street from Users as u INNER JOIN u.address as a");

      List<Object[]> list3= q4.getResultList();

        for(Object arr[] : list3)
        {
            System.out.println(Arrays.toString(arr));
        }


        tx.commit();
        session.close();

        factory.close();


    }
}
