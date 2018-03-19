package Exercicio412;

public class Casa {

	private String cor;
	private Porta porta1, porta2, porta3;

	public Casa() {
		this.porta1 = new Porta();
		this.porta2 = new Porta();
		this.porta3 = new Porta();
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Porta getPorta1() {
		return porta1;
	}

	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}

	public Porta getPorta2() {
		return porta2;
	}

	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}

	public Porta getPorta3() {
		return porta3;
	}

	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}

	public void pinta(String _cor) {
		this.cor = _cor;
	}

	public int quantasPortasEstaoAbertas() {
		int abertas = 0;
		if (this.porta1.estaAberta())
			abertas++;
		if (this.porta2.estaAberta())
			abertas++;
		if (this.porta3.estaAberta())
			abertas++;

		return abertas;
	}
}
