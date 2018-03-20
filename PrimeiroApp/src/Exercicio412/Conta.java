package Exercicio412;

//Exerc�cio 01/02...
public class Conta {

	private String nomeTitular;
	private int numero;
	private String agencia;
	private double saldo;
	// Exerc�cio 06...
	// private String dataAbertura;
	private Data dataAbertura;
	
	private static int identificador = 0;

	public Conta() {
		dataAbertura = new Data();
		Conta.identificador++;
	}
	
	//Exerc�cio 04...
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
		info += "N�mero.......: " + this.numero + "\n";
		info += "Ag�ncia......: " + this.agencia + "\n";
		info += "Saldo........: " + this.saldo + "\n";
		/*info += "Data Abertura: " + this.dataAbertura.getDia() + "/" + this.dataAbertura.getMes() + "/"
				+ this.dataAbertura.getAno() + "\n";*/
		//Exerc�cio 09...
		info += "Data Abertura: " + this.dataAbertura.dataformatada() + "\n";

		return info;
	}
}
