package Exercicio412;

public class Teste {
	public static void main (String[] args)
	{		
		Conta c1 = new Conta();
		Conta c2 = new Conta();			
		
		c1.setNomeTitular("Dennis Ribeiro");
		c1.setNumero(12345);
		c1.setAgencia("12345-6");
		//c1.setDataAbertura("18/12/1990");
		c1.setDataAbertura(18, 12, 1990);
		c1.setSaldo(1500);
		
		//Exerc�cio 04...
		c2.setNomeTitular("Dennis Ribeiro");
		c2.setNumero(12345);
		c2.setAgencia("12345-6");
		//c2.setDataAbertura("18/12/1990");
		c2.setDataAbertura(18, 12, 1990);
		c2.setSaldo(1500);
		
		if (c1 == c2)
			System.out.println("Iguais...");
		else
			System.out.println("Diferentes...");
		
		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println(c2.recuperaDadosParaImpressao());
		
		//Exerc�cio 05...
		c1 = c2;
		if (c1 == c2)
			System.out.println("Iguais...");
		else
			System.out.println("Diferentes...");
	}
}
