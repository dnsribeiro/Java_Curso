package Desafio138;

public class ConversaoStr {

	public static void main(String[] args) {
		
		String s1 = "587";
		
		//Converte uma string em inteiro...
		int num = 0;
		int numAux = 1;
		
		for (int i=s1.length()-1; i>=0; i--) {
			char c = s1.charAt(i);
			int aux = c - '0';
			
			num += aux * numAux;
			numAux *= 10;
		}
		
		System.out.println(num + 13);
	}
	
}
