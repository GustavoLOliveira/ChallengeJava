package teste;

public class Usuario {

	private String nomeCompleto;
	private String nomeUsuario;
	private long cpf;
	private String dataNascimento;
	private long telefone;
	private String endereco;
	private int nivelInvestidor;
	
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNivelInvestidor() {
		return nivelInvestidor;
	}
	public void setNivelInvestidor(int nivelInvestidor) {
		this.nivelInvestidor = nivelInvestidor;
	}

	Usuario(String receberNomeCompleto, String receberNomeUsuario, long receberCpf, String receberDataNascimento, long receberTelefone, String receberEndereco, int receberNivelInvestidor){
		this.setNomeCompleto(receberNomeCompleto);
		this.setNomeUsuario(receberNomeUsuario);
		this.setCpf(receberCpf);
		this.setDataNascimento(receberDataNascimento);
		this.setTelefone(receberTelefone);
		this.setEndereco(receberEndereco);
		this.setNivelInvestidor(receberNivelInvestidor);
		
		
		System.out.println("Nome completo: " + receberNomeCompleto +
				"\nNome Usuario: " + receberNomeUsuario + 
				"\nCPF: " + receberCpf +
				"\nData de nascimento: " + receberDataNascimento +
				"\nTelefone: " + receberTelefone +
				"\nEndereco: " + receberEndereco +
				"\nNivel de Investidor: " + receberNivelInvestidor);
	}
}
