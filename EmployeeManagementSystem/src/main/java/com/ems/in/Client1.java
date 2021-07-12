package com.ems.in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ems.in.model.Employee;

public class Client1 {

	public static void main(String[] args) {
		
		//EntityManagerFactory
		 EntityManagerFactory factory=Persistence.createEntityManagerFactory("emsdb");
		 
		//EntityManager
		 EntityManager emanager=factory.createEntityManager();
		 
		 //All Non Select Operations must be done within Transaction
		 
		 emanager.getTransaction().begin();
		 
		 Employee e1=new Employee();
		 e1.setEname("Rajeev");
		 e1.setEcity("Vijayawada");
		 
		 emanager.persist(e1);
		 
		 emanager.getTransaction().commit();
		 
		 emanager.clear();
		 factory.close();
		
	}

}
