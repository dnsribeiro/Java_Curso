
public class BalancoTrimestral {

	//Exerc�cio 3.3...
	public static void main(String[] args) {
		//Exerc�cio 01...
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;	
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println(gastosTrimestre);
		
		//Exerc�cio 02...
		double mediaMensal = gastosTrimestre / 3;
		System.out.println("Valor da m�dia mensal = " + mediaMensal);
	}

}
