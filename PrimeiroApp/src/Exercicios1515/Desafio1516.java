package Exercicios1515;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Desafio1516 {

	public static void main(String[] args) {
		
		Collection<Integer> arvore  = new TreeSet<>();
				
		for (int i=1; i <= 1000; i++)
			arvore.add(i);
				
		arvore.iterator();
	}
}
