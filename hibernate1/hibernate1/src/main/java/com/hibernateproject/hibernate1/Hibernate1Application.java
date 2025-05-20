package com.hibernateproject.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.hibernate.cfg.Configuration;


@SpringBootApplication
public class Hibernate1Application {

	public static void main(String[] args) {
		SpringApplication.run(Hibernate1Application.class, args);

		System.out.println("Project Started....");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");   // path of configuration file
		SessionFactory factory=cfg.buildSessionFactory();

		// creating student

		Student st = new Student();
		st.setId(101);
		st.setName("john");
		st.setCity("dadar");

		System.out.println(st);

		Session session= factory.openSession();
		/// /

		Transaction tx= session.beginTransaction();

		session.save(st);

		tx.commit();

		session.close();



		//SessionFactory factory = new Configuration().configure().buildSessionFactory();
	}

}
