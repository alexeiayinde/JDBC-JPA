package org.ss.jpa.intro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.ss.jpa.intro.domain.Address;
import org.ss.jpa.intro.domain.Contact;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("digi-book-jpa");
		EntityManager em = emf.createEntityManager();

		// Contact contact = em.find(Contact.class, 2L);
		// System.out.println(contact.getEmail());

		EntityTransaction et = em.getTransaction();
		et.begin();

		Contact contact = new Contact();
		contact.setEmail("dta@dta.fr");
		contact.setFirstName("DTA");
		contact.setLastName("INGENIERIE");
		contact.setAddress(new Address("5 rue Jacques Brel, 44000 Saint-Herblain"));
		em.persist(contact);

		et.commit();

		// List<Contact> list = em.createQuery("from Contact",
		// Contact.class).getResultList();

		// for (Contact c : list)
		// System.out.println(c);

		em.close();
		emf.close();

	}

}
