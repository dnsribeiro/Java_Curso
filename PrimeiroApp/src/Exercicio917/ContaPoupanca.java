package Exercicio917;

public class ContaPoupanca extends Conta {

	private int numPoupanca;
	
	public ContaPoupanca() {
		super();
		this.numPoupanca = 0;
	}

	public int getNumPoupanca() {
		return numPoupanca;
	}

	public void setNumPoupanca(int numPoupanca) {
		this.numPoupanca = numPoupanca;
	}
	
	@Override
	public String getTipo() {
		return " Poupan�a";
	}
}
