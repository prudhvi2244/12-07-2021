package com.ems.in;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ems.in.model.Employee;
import com.ems.in.model.Person;
import com.ems.in.model.Vehicle;

public class Client5 {

	public static void main(String[] args) {

		// EntityManagerFactory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsdb");

		// EntityManager
		EntityManager emanager = factory.createEntityManager();

		emanager.getTransaction().begin();

		Vehicle v1=new Vehicle();
		v1.setVname("Toyota Fortuner");
		
		Vehicle v2=new Vehicle();
		v2.setVname("Toyota Innova Crysta");
		
		
		Person p1=new Person();
		p1.setPname("Raj");
		p1.setPcity("Bangalore");
		p1.setVehicles(Arrays.asList(v1,v2));
		
		emanager.persist(p1);
		
		emanager.getTransaction().commit();

		emanager.clear();
		factory.close();

	}

}
