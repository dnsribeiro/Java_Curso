
public class Exercicio313 {

	// Exerc�cio 3.13...
	public static void main(String[] args) {

		// Exerc�cio 01...
		for (int i = 150; i <= 300; i++)
			System.out.println(i);

		// Exerc�cio 02...
		int soma = 0;
		for (int i = 150; i <= 300; i++)
			soma += i;
		System.out.println(soma);

		// Exerc�cio 03...
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				System.out.println(i);
		}

		// Exerc�cio 04...
		int fatorial = 1;
		for (int i = 1; i <= 10; i++) {
			fatorial *= i;
			System.out.println(fatorial);
		}

		// Exerc�cio 05...
		long fatorial2 = 1;
		for (int i = 1; i <= 40; i++) {
			fatorial2 *= i;
			System.out.println(fatorial2);
		}

		// Exerc�cio 06...
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1 + "\n" + num2);
		do {
			int fib = num1 + num2;
			System.out.println(fib);
			fib = num1 + num2;
			num1 = num2;
			num2 = fib;
		} while (num1 + num2 <= 100);

		// Exerc�cio 07...
		int x = 13;
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			System.out.println(x);
		}

		// Exerc�cio 08...
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}

		// Exerc�cio 3.14 (Desafio)...
		// Exerc�cio 06...		
		System.out.println("0\n1");
		int num3 = 1;
		int fib  = 1; 
		do {			
			System.out.println(fib);			
			fib  = fib + num3;
			num3 = fib - num3;
		} while (fib <= 100);
	}

}
