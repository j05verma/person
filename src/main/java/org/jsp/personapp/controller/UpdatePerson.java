package org.jsp.personapp.controller;

import java.util.Scanner;

import org.jsp.personapp.dao.PersonDao;
import org.jsp.personapp.dto.Person;

public class UpdatePerson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ID to upadate record");
		int id=sc.nextInt();
		System.out.println("Enter your new name");
		String name=sc.next();
		System.out.println("Enter your new password");
		String password=sc.next();
		System.out.println("Enter your new Phone number");
		long phone=sc.nextLong();
		
		Person p=new Person();
		p.setId(id);
		p.setName(name);
		p.setPassword(password);
		p.setPhone(phone);
		
		PersonDao dao=new PersonDao();
		dao.updatePerson(p);
	}

}
