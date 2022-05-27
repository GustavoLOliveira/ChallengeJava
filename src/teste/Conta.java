package teste;

public class Conta extends Usuario {

	private int numConta;
	private double saldo;

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	Conta(int receberNumConta, double receberSaldo, String receberNomeCompleto, String receberNomeUsuario, long receberCpf, String receberDataNascimento, long receberTelefone, String receberEndereco, int receberNivelInvestidor){
		super(receberNomeCompleto, receberNomeUsuario, receberCpf, receberDataNascimento, receberTelefone, receberEndereco, receberNivelInvestidor);
		this.setNumConta(receberNumConta);
		this.setSaldo(receberSaldo);
		
		
		System.out.println("Nome completo: " + receberNomeCompleto +
				"\nNome Usuario: " + receberNomeUsuario + 
				"\nCPF: " + receberCpf +
				"\nData de nascimento: " + receberDataNascimento +
				"\nTelefone: " + receberTelefone +
				"\nEndereco: " + receberEndereco +
				"\nNivel de Investidor: " + receberNivelInvestidor + 
				"\nNumero da conta: " + receberNumConta + 
				"\nSaldo da conta: " + receberSaldo);
	}
}

