package Desafio138;

public class Testes4 {

	public static void main(String[] args) {

		String[] vetStr = new String[10];

		// Populando...
		for (int i = 0; i < 10; i++) {
			vetStr[i] = "N�mero " + i;
		}
		
		//Imprimindo...
		for (int i = 0; i < 10; i++) {
			System.out.println(vetStr[i]);
		}
		
		//Usando o Enhanced For (ForEach)...
		//Imprimindo...
		for (String s : vetStr)
			System.out.println(s);
	}

}
