package Exercicio917;

public class MinhaExcecao extends RuntimeException {
	
	public MinhaExcecao(String _msg) {
		super(_msg);
	}
	
	public void setValor1(double _valor) {
		try {
			throw new MinhaExcecao("Erro 1");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public void setValor2(double _valor) throws ArithmeticException {
		throw new MinhaExcecao("Erro 2");
	}
		
	@Override
	public String toString() {
		return "Meu erro sobrescrevendo o toString()";
	}
}
