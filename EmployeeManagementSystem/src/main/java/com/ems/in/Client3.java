package com.ems.in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ems.in.model.Employee;

public class Client3 {

	public static void main(String[] args) {

		// EntityManagerFactory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsdb");

		// EntityManager
		EntityManager emanager = factory.createEntityManager();

		emanager.getTransaction().begin();

		Employee employee = emanager.find(Employee.class, 2);
		if (employee != null) {
			emanager.remove(employee);
			emanager.getTransaction().commit();
			System.out.println("Employee With Given ID ,Deleted Successfully!");
		} else {
			System.out.println("Employee With Given ID Not Available");
		}

		emanager.clear();
		factory.close();

	}

}
