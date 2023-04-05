package org.jsp.personapp.controller;

import java.util.Scanner;

import org.jsp.personapp.dao.PersonDao;
import org.jsp.personapp.dto.Person;

public class DeletePerson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ID to delete the record");
		int id=sc.nextInt();
		PersonDao dao=new PersonDao();
		if(dao.deletePerson(id)==true)
		{
			System.out.println("ID "+id+" is record is deleted");
		}
		else
		{
			System.err.println("Id "+id+" is not found");
		}
	}

}
