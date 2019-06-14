package org.ss.jpa.intro;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.ss.jpa.intro.domain.Contact;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("digi-book-jpa");
		EntityManager em = emf.createEntityManager();

		List<Contact> list = em.createQuery("from Contact", Contact.class).getResultList();

		for (Contact c : list)
			System.out.println(c);

		em.close();
		emf.close();

	}

}
