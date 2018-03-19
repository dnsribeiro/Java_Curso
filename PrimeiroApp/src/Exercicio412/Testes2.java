package Exercicio412;

public class Testes2 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Dennis Ribeiro");
		p1.setIdade(15);

		p1.fazAniversario();
		p1.fazAniversario();
		p1.fazAniversario();

		System.out.println("Nome: " + p1.getNome() + "\nIdade: " + p1.getIdade());

		Porta p2 = new Porta();
		p2.abre();
		p2.fecha();
		p2.pinta("Azul");
		p2.pinta("Verde");
		p2.pinta("Amarela");
		p2.setDimensaoX(10);
		p2.setDimensaoY(15);
		p2.setDimensaoZ(25);
		System.out.println("Aberta: " + (p2.estaAberta() ? "Sim" : "N�o"));
		
		Casa c1 = new Casa();
		c1.getPorta1().fecha();
		c1.getPorta2().abre();
		c1.getPorta3().abre();
		System.out.println(c1.quantasPortasEstaoAbertas());
	}

}
