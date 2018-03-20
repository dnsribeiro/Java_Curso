package Exercicio412;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		//Exerc�cio 06...
		if (this.mes == 2 && dia >= 29)
			return;
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		//Exerc�cio 06...
		if (mes == 2 && this.dia >= 29)
			return;
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String dataformatada() {
		return (this.dia + "/" + this.mes + "/" + this.ano);
	}
}
