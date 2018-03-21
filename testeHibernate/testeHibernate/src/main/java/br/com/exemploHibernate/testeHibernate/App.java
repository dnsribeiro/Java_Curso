package br.com.exemploHibernate.testeHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.exemploHibernate.model.Teste;
import br.com.exemploHibernate.utils.HibernateSessionFactoryUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Início testeHibernate");

		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session s = sf.openSession();

		@SuppressWarnings("unchecked")
		List<Teste> testes = (List<Teste>)s.createQuery("from Teste").list();

		for (Teste teste : testes)
			System.out.println(String.valueOf("ID: " + teste.getId()) + " DESCRIÇÃO: " + teste.getDescricao());

		s.close();
		sf.close();

		System.out.println("Fim testeHibernate");
	}
}
