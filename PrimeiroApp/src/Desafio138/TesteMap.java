package Desafio138;

import java.util.HashMap;
import java.util.Map;

import Exercicio917.Conta;
import Exercicio917.ContaCorrente;
import Exercicio917.ContaPoupanca;

public class TesteMap {

	public static void main(String[] args) {
		Map<String, String> meuMapa = new HashMap<>();
		
		meuMapa.put("String 1", "Valor ABC");
		meuMapa.put("String 2", "Valor DEF");
		meuMapa.put("String 3", "Valor GHI");
		
		System.out.println(meuMapa.get("String 2"));
		
		Map<String, Conta> meuMapa2 = new HashMap<>();
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setNumero(10);
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(20);
		
		meuMapa2.put("CC1", c1);
		meuMapa2.put("CC2", c2);
		
		System.out.println(meuMapa2.get("CC1").getNumero());
		System.out.println(meuMapa2.get("CC2").getNumero());
	}
}
