package org.example.onetomany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MainEmployeeProject {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();

        cfg.configure("onetomanyhibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Department department = new Department();
        department.setDeptName("Science");
        department.setLocation("pune");
        department.setCode("1111");
        department.setCreateDate(LocalDateTime.of(1111,11,11,0,0));
        department.setUpdatedDate(LocalDateTime.of(2222,2,22,0,0));





        Employee employee = new Employee();
    //    employee.setId(1);
        employee.setName("nani");
        employee.setEmail("nani@gmail.com");
        employee.setCity("puneri");
        employee.setState("MH");
        employee.setCompanyName("Google");




        employee.setDepartment(department);




        Project project = new Project();
  //      project.setId(11);
        project.setName("c#");
        project.setDuration(4L);
        project.setDescription("c# is programming language");
        project.setEmployee(employee);

        Project project1 = new Project();
    //    project1.setId(22);
        project1.setName("c");
        project1.setDuration(5L);
        project1.setDescription("python is programming language");
        project1.setEmployee(employee);

        List<Project> pList = new ArrayList<>();

        pList.add(project);
        pList.add(project1);

       employee.setProject(pList);  // ++


        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();


        session.save(department);

        session.save(employee);
        session.save(project);
        session.save(project1);


        tx.commit();
        session.close();





    }
}
