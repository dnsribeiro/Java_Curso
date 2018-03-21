package br.com.exemploHibernate.testeHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import br.com.exemploHibernate.model.Teste;
import br.com.exemploHibernate.utils.HibernateSessionFactoryUtils;
import br.com.exemploHibernate.model.Pessoa;

public class App {
	//Suprimir os warnings...
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("Início testeHibernate");

		// Pega a congiguração do "hibernate.cfg.xml"...
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		// Inicia a sessão...
		Session s = sf.openSession();

		// Nova Transação...
		s.beginTransaction().begin();

		// Incluindo 1...
		Pessoa oPessoa = new Pessoa();
		oPessoa.setCpf("123.456.789-01");
		oPessoa.setNome("Fulano 1");
		oPessoa.setIdade(15);
		s.save(oPessoa);

		// Incluindo 2...
		oPessoa = new Pessoa();
		oPessoa.setCpf("987.654.321-02");
		oPessoa.setNome("Fulano 2");
		oPessoa.setIdade(35);
		s.save(oPessoa);

		// Incluindo 3...
		oPessoa = new Pessoa();
		oPessoa.setCpf("159.267.483-03");
		oPessoa.setNome("Fulano 3");
		oPessoa.setIdade(45);
		s.save(oPessoa);

		// Fecha transação...
		s.beginTransaction().commit();
		
		// Mostrando registros...
		List<Pessoa> pessoas = (List<Pessoa>) s.createQuery("from Pessoa").list();
		for (Pessoa pessoa : pessoas)
			System.out.println(String.valueOf("CPF: " + pessoa.getCpf()) + " Nome: " + pessoa.getNome() + " Idade: "
					+ pessoa.getIdade());

		// Alterando o Pessoa 2...
		s.beginTransaction().begin();
		oPessoa = s.get(Pessoa.class, "987.654.321-02"); // null se não achar...
		if (oPessoa != null) {
			oPessoa.setNome("Fulano alterado");
			s.update(oPessoa);
		}
		s.beginTransaction().commit();

		// Mostrando registros...
		pessoas = (List<Pessoa>) s.createQuery("from Pessoa").list();		
		for (Pessoa pessoa : pessoas)
			System.out.println(String.valueOf("CPF: " + pessoa.getCpf()) + " Nome: " + pessoa.getNome() + " Idade: "
					+ pessoa.getIdade());

		// Excluindo o Pessoa 1...
		s.beginTransaction().begin();
		oPessoa = s.get(Pessoa.class, "123.456.789-01");
		s.delete(oPessoa);
		s.beginTransaction().commit();

		// Mostrando registros...
		pessoas = (List<Pessoa>) s.createQuery("from Pessoa").list();
		for (Pessoa pessoa : pessoas)
			System.out.println(String.valueOf("CPF: " + pessoa.getCpf()) + " Nome: " + pessoa.getNome() + " Idade: "
					+ pessoa.getIdade());

		s.close();
		sf.close();

		System.out.println("Fim testeHibernate");
	}
}
