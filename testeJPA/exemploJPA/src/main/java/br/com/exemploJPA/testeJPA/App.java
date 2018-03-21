package br.com.exemploJPA.testeJPA;

import java.util.List;

import javax.management.openmbean.OpenMBeanOperationInfoSupport;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.exemploJPA.model.Pessoa;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Início testeJPA");

		// Novos testes...
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testeJPA");
		EntityManager em = emf.createEntityManager();

		// Nova Transação...
		em.getTransaction().begin();

		// Incluindo 1...
		Pessoa oPessoa = new Pessoa();
		oPessoa.setCpf("123.456.789-01");
		oPessoa.setNome("Fulano 1");
		oPessoa.setIdade(15);
		em.persist(oPessoa);

		// Incluindo 2...
		oPessoa = new Pessoa();
		oPessoa.setCpf("987.654.321-02");
		oPessoa.setNome("Fulano 2");
		oPessoa.setIdade(35);
		em.persist(oPessoa);

		// Incluindo 3...		
		oPessoa = new Pessoa();
		oPessoa.setCpf("159.267.483-03");
		oPessoa.setNome("Fulano 3");
		oPessoa.setIdade(45);
		em.persist(oPessoa);

		em.getTransaction().commit();

		// Mostrando registros...
		List<Pessoa> pessoas = em.createQuery("from Pessoa", Pessoa.class).getResultList();
		for (Pessoa pessoa : pessoas)
			System.out.println(String.valueOf("CPF: " + pessoa.getCpf()) + " Nome: " + pessoa.getNome() + " Idade: "
					+ pessoa.getIdade());

		// Alterando o Pessoa 2...
		em.getTransaction().begin();
		oPessoa = em.find(Pessoa.class, "987.654.321-02"); // null se não achar...
		if (oPessoa != null)
		{
			oPessoa.setNome("Fulano alterado");
			em.merge(oPessoa);
		}
		em.getTransaction().commit();			

		// Mostrando registros...
		pessoas = em.createQuery("from Pessoa", Pessoa.class).getResultList();
		for (Pessoa pessoa : pessoas)
			System.out.println(String.valueOf("CPF: " + pessoa.getCpf()) + " Nome: " + pessoa.getNome() + " Idade: "
					+ pessoa.getIdade());

		// Excluindo o Pessoa 1...
		em.getTransaction().begin();
		oPessoa = em.find(Pessoa.class, "123.456.789-01");
		em.remove(oPessoa);
		em.getTransaction().commit();

		// Mostrando registros...
		pessoas = em.createQuery("from Pessoa", Pessoa.class).getResultList();
		for (Pessoa pessoa : pessoas)
			System.out.println(String.valueOf("CPF: " + pessoa.getCpf()) + " Nome: " + pessoa.getNome() + " Idade: "
					+ pessoa.getIdade());

		//Fechando os objetos...
		em.close();
		emf.close();

		System.out.println("Fim testeJPA");
	}
}
