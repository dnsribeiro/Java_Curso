package Exercicio917;

public abstract class Conta {

	private int numero;
	private String agencia;

	public Conta() {
		this.numero = 0;
		this.agencia = "";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String impressaoDados() {
		return this.numero + " / " + this.agencia + this.getTipo();
	}

	public abstract String getTipo(); // { return "Conta"; }

	//Sobrescrita 1 do equals...
	/*@Override
	public boolean equals(Object _obj) {
		return meuIgual((Conta) _obj);
	}

	public boolean meuIgual(Conta _c) {
		if (this.numero == _c.getNumero() && this.agencia == _c.getAgencia())
			return true;
		return false;
	}*/
	
	//Sobrescrita 2 do equals...
	@Override
	public boolean equals(Object _obj) {
		Conta c = (Conta) _obj;
		if (this.numero == c.getNumero() && this.agencia == c.getAgencia())
			return true;
		return false;
	}
}
