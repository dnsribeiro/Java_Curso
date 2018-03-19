package Exercicio412;

public class Desafios {
		
	public static void main(String[] args) {
		System.out.println("Fibonacci...");
		
		Fibonacci f1 = new Fibonacci();
		for (int i=1; i<=10; i++) {
			System.out.println(f1.calcular(i));			
		}
				
		for (int i=1; i<=10; i++) {
			System.out.println(f1.calcularTernario(i));			
		}
		
	}
}
