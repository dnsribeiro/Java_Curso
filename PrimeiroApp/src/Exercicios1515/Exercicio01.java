package Exercicios1515;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Exercicio01 {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		
		Collection<Integer> teste = new ArrayList<>();
		//Collection<Integer> teste = new HashSet<>();
		long inicio, fim, tempo, iniTotal, fimTotal;
						
		int total = 30000;
		
		inicio = iniTotal = System.currentTimeMillis();
		for (int i=0; i<total; i++)
			teste.add(i);
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto Insert: " + tempo);
		
		inicio = System.currentTimeMillis();
		for (int i=0; i<total; i++)
			teste.contains(i);
		fim = fimTotal = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto Search: " + tempo);
				
		tempo = fimTotal - iniTotal;
		System.out.println("Tempo gasto Total: " + tempo);		
	}
}
