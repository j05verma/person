package org.jsp.personapp.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsp.personapp.dto.Person;

public class PersonDao {
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	
	public Person registerPerson(Person person)
	{
		Transaction transaction=session.beginTransaction();
		session.save(person);
		transaction.commit();
		return person;
	}
	public Person updatePerson(Person person)
	{
		Transaction t=session.beginTransaction();
		session.update(person);
		t.commit();
		return person;
	}
	public Person viewPerson(int id)
	{
		return session.get(Person.class, id);
	}
	public boolean deletePerson(int id)
	{
		Person person=viewPerson(id);
		if(person!=null)
		{
			session.delete(person);
			Transaction t=session.beginTransaction();
			t.commit();
			return true;
		}
		return false;
	}
	

}
