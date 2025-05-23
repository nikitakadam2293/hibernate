package org.example.criteria;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.persister.collection.mutation.RowMutationOperations;
//import org.hibernate.persister.collection.mutation.RowMutationOperations;

import java.util.List;

public class CriteriaExample {

    public static void main(String[] args) {

        Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

       // Criteria c = session.createCriteria(Student.class);
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        cq.select(root); // select * from Student



        List<Student> studentList = session.createQuery(cq).getResultList();

//        studentList.add(Restrictions.eq())
//        studentList.add(RowMutationOperations.Restrictions.equal());
        for (Student s : studentList) {
            System.out.println(s);
        }



        session.close();

    }
}
