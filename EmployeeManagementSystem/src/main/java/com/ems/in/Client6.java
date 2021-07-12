package com.ems.in;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ems.in.model.Bank;
import com.ems.in.model.Customer;
import com.ems.in.model.Employee;
import com.ems.in.model.Person;
import com.ems.in.model.Vehicle;

public class Client6 {

	public static void main(String[] args) {

		// EntityManagerFactory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsdb");

		// EntityManager
		EntityManager emanager = factory.createEntityManager();

		emanager.getTransaction().begin();
		
		Bank b1=new Bank();
		b1.setBname("ICICI Bank");
		
		emanager.persist(b1);
		
		Customer c1=new Customer();
		c1.setCname("Rajeev");
		c1.setCcity("Hyderabad");
		c1.setBank(b1);
		
		Customer c2=new Customer();
		c2.setCname("Raj Prudhvi");
		c2.setCcity("Bangalore");
		c2.setBank(b1);
		
		
		emanager.persist(c1);
		emanager.persist(c2);
		
		
		
		emanager.getTransaction().commit();

		emanager.clear();
		factory.close();

	}

}
