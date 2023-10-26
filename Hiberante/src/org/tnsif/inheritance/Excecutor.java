package org.tnsif.inheritance;

import javax.persistence.EntityManager;

import org.tnsif.jpaintro.JPAUtil;

public class Excecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=JPAUtil.getEntityManager();
		Person p=new Person();
		p.setId(105);
		p.setName("Mahesh");
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		Employee e=new Employee();
		e.setId(106);
		e.setName("Mohit");
		e.setSalary(8000);
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}

}
