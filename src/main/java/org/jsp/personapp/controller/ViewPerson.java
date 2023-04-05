package org.jsp.personapp.controller;

import java.util.Scanner;

import org.jsp.personapp.dao.PersonDao;
import org.jsp.personapp.dto.Person;

public class ViewPerson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id to print details");
		int id=sc.nextInt();
		PersonDao dao=new PersonDao();
		Person p=dao.viewPerson(id);
		if(p!=null) {
		System.out.println("ID: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Password: "+p.getPassword());
		System.out.println("Phone: "+p.getPhone());
		}
		else
		{
			System.err.println("ID is not found");
		}
	}

}
