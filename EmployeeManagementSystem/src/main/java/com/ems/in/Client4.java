package com.ems.in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ems.in.model.Employee;

public class Client4 {

	public static void main(String[] args) {

		// EntityManagerFactory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsdb");

		// EntityManager
		EntityManager emanager = factory.createEntityManager();

		emanager.getTransaction().begin();

		Employee employee=emanager.find(Employee.class,1);
		
		employee.setEcity("Bangalore");
		
		emanager.merge(employee);
		
		emanager.getTransaction().commit();

		emanager.clear();
		factory.close();

	}

}
