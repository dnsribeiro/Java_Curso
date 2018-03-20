package Desafio138;

public class MinhaString implements Comparable<MinhaString> {

	private static int numeroString = 0;

	private String valor;
	private int numero;

	public MinhaString(String _s) {
		this.valor = _s;
		this.numero = ++MinhaString.numeroString;
	}

	public int compareTo(MinhaString _s) {
		if (this.numero < _s.numero)
			return -1;
		else if (this.numero > _s.numero)
			return 1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}

}
