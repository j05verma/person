package org.jsp.personapp.controller;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Session factory=new Configuration().configure().buildSessionFactory().openSession();
		System.out.println(factory);
	}

}
