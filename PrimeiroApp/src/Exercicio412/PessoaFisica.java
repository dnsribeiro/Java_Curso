package Exercicio412;

public class PessoaFisica {

	private String cpf;
	
	public PessoaFisica(String _cpf) {
		if (PessoaFisica.validarCPF(_cpf))
			System.out.println("CPF inv�lido");
		else
			this.cpf = _cpf;
	}

	public static boolean validarCPF(String _cpf) {
		if (_cpf.equals(""))
			return false;		
		return true;
	}
}
