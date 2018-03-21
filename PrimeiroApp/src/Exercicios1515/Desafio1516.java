package Exercicios1515;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Desafio1516 {

	public static void main(String[] args) {

		Collection<Integer> arvore = new TreeSet<>();		
		
		for (int i = 1000; i >= 1; i--)
			arvore.add(i);							

		for (Iterator<Integer> i = arvore.iterator(); i.hasNext(); )
			System.out.println(i.next());
	}
}
