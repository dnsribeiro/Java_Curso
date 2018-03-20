package Exercicio917;

public class Desafio1212 {

	public static void main(String[] args) {
		//Provoca o "StackOverflowError"...
		RecursaoEstouroMemoria();		
	}
	
	public static void RecursaoEstouroMemoria() {
		RecursaoEstouroMemoria();
	}
}
