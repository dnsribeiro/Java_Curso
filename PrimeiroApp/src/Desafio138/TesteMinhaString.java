package Desafio138;

import java.util.ArrayList;
import java.util.Collections;
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

		System.out.println(vetStr);

		Collections.sort(vetStr);

		System.out.println(vetStr);
	}
}
