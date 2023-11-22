package jpa;
import java.util.List;

import Domain.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
public class JpaTest {
	private EntityManager manager;
	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManager manager = EntityManagerHelper.getEntityManager();
		JpaTest test = new JpaTest(manager);
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			User s = new Student();
			s.setName("Hugo");
			s.setPassword("1234");

			User t = new Teacher();
			t.setName("Walid");
			t.setPassword("1234");
			manager.persist(s);
			manager.persist(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		System.out.println(".. done");
	}
}
