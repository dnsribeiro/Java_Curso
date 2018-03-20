package Exercicio917;

public class Teste3 {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		ContaPoupanca c2 = new ContaPoupanca();

		c1.setAgencia("abc");
		c1.setNumero(5);

		c2.setAgencia("abc");
		c2.setNumero(5);

		System.out.println(c1.impressaoDados());
		System.out.println(c2.impressaoDados());

		System.out.println(c1.getTipo());
		System.out.println(c2.getTipo());

		/*
		 * Conta c3 = new Conta(); System.out.println(c3.getTipo());
		 */

		IR ir = new IR();
		System.out.println(ir.getIR(c1));
		System.out.println(ir.getIR(c2));
		// System.out.println(ir.getIR(c3));

		MinhaExcecao ex = new MinhaExcecao("Erro aqui");
		ex.setValor1(10);
		try {
			ex.setValor2(20);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(ex.toString());
		System.out.println(ex); //Convers�o impl�cita...
		
		System.out.println( c1.equals(c2) ? "Sim" : "N�o");
		String s = new String("Teste");
		System.out.println(s.intern());		
	}	
}
