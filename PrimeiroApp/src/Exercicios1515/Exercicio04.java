package Exercicios1515;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercicio04 {

	public static void main(String[] args) {
		System.out.println("Iniciando...");

		//List<Integer> teste = new ArrayList<>();
		List<Integer> teste = new LinkedList<>();
		long inicio, fim, tempo, iniTotal, fimTotal;

		int total = 30000;

		inicio = iniTotal = System.currentTimeMillis();
		for (int i = 0; i < total; i++)
			teste.add(i);
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto Insert: " + tempo);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++)
			teste.contains(i);
		/*Iterator<Integer> i = teste.iterator();
		while (i.hasNext())
			i.next();*/
		fim = fimTotal = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto Search: " + tempo);

		tempo = fimTotal - iniTotal;
		System.out.println("Tempo gasto Total: " + tempo);
	}
}
