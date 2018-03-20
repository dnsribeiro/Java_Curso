package Exercicio917;

public class ContaCorrente extends Conta implements Tributavel {

	private int numCorrente;

	public ContaCorrente() {
		super();
		this.numCorrente = 0;
	}

	public int getNumCorrente() {
		return numCorrente;
	}

	public void setNumCorrente(int numCorrente) {
		this.numCorrente = numCorrente;
	}
	
	@Override
	public String getTipo() {
		return " Corrente";
	}

	@Override
	public double getValorImposto() {
		return 500;
	}

}
