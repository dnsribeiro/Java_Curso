package Exercicio412;

//Exercício 01/02...
public class Conta {

	private String nomeTitular;
	private int numero;
	private String agencia;
	private double saldo;
	// Exercício 06...
	// private String dataAbertura;
	private Data dataAbertura;
	
	private static int identificador = 0;

	public Conta() {
		dataAbertura = new Data();
		Conta.identificador++;
	}
	
	//Exercício 04...
	public Conta(String _titular) {
		dataAbertura = new Data();
		this.nomeTitular = _titular;
		Conta.identificador++;
	}
	
	public static int getIdentificador()
	{
		return Conta.identificador;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(int _dia, int _mes, int _ano) {
		this.dataAbertura.setDia(_dia);
		this.dataAbertura.setMes(_mes);
		this.dataAbertura.setAno(_ano);
	}

	public void sacar(double _valor) {
		this.saldo -= _valor;
	}

	public void depositar(double _valor) {
		this.saldo += _valor;
	}

	public double calcularRendimento() {
		return this.saldo * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		String info;

		info = "Nome.........: " + this.nomeTitular + "\n";
		info += "Número.......: " + this.numero + "\n";
		info += "Agência......: " + this.agencia + "\n";
		info += "Saldo........: " + this.saldo + "\n";
		/*info += "Data Abertura: " + this.dataAbertura.getDia() + "/" + this.dataAbertura.getMes() + "/"
				+ this.dataAbertura.getAno() + "\n";*/
		//Exercício 09...
		info += "Data Abertura: " + this.dataAbertura.dataformatada() + "\n";

		return info;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
}
