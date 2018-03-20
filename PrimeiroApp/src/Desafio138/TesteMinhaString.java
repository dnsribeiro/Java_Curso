package Desafio138;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TesteMinhaString {

	public static void main(String[] args) {

		List<MinhaString> vetStr = new ArrayList<>();

		MinhaString s1 = new MinhaString("Primeiro");
		MinhaString s2 = new MinhaString("Segundo");
		MinhaString s3 = new MinhaString("Terceiro");

		vetStr.add(s2);
		vetStr.add(s3);
		vetStr.add(s1);

		// Ordem de inclus�o...
		System.out.println(vetStr);

		// Minha ordena��o com o "implements ComparteTo"...
		Collections.sort(vetStr);
		System.out.println(vetStr);

		// Misturando os itens da lista...
		Collections.shuffle(vetStr);
		System.out.println(vetStr);

		Iterator<MinhaString> i = vetStr.iterator();
		while (i.hasNext()) {			
			System.out.println(i.next());			
		}
	}
}
