package com.ems.in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ems.in.model.Employee;

public class Client2 {

	public static void main(String[] args) {
		
		//EntityManagerFactory
		 EntityManagerFactory factory=Persistence.createEntityManagerFactory("emsdb");
		 
		//EntityManager
		 EntityManager emanager=factory.createEntityManager();
		 
		 //For Select Operations no need to begin Transaction
		 
		Employee employee1= emanager.find(Employee.class,4);
		if(employee1!=null)
		{
			System.out.println("Employee ID :"+employee1.getEid());
			System.out.println("Employee Name :"+employee1.getEname());
			System.out.println("Employee City :"+employee1.getEcity());
		}
		else
		{
			System.out.println("Employee Not Available");
		}
		
		 
		 emanager.clear();
		 factory.close();
		
	}

}
