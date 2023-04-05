package org.jsp.personapp.controller;

import java.util.Scanner;

import org.jsp.personapp.dao.PersonDao;
import org.jsp.personapp.dto.Person;

public class RegisterPerson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name to register data");
		String name=sc.next();
		System.out.println("Enter your password to register data");
		String password=sc.next();
		System.out.println("Enter your phone number to register data");
		long phone=sc.nextLong();
		
		
		 Person p=new Person();
		 p.setName(name);
		 p.setPassword(password);
		 p.setPhone(phone);
		 
		 PersonDao dao=new PersonDao();
		 dao.registerPerson(p);
	}

}
