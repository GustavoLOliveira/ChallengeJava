package teste;

public class Acao extends Usuario {
	
	private int quantidadeAcessos;
	private int quantidadeAportes;
	private double valorAportes;
	private double compraCripto;
	private double vendaCripto;
	
	
	public int getQuantidadeAcessos() {
		return quantidadeAcessos;
	}
	public void setQuantidadeAcessos(int quantidadeAcessos) {
		this.quantidadeAcessos = quantidadeAcessos;
	}
	public int getQuantidadeAportes() {
		return quantidadeAportes;
	}
	public void setQuantidadeAportes(int quantidadeAportes) {
		this.quantidadeAportes = quantidadeAportes;
	}
	public double getValorAportes() {
		return valorAportes;
	}
	public void setValorAportes(double valorAportes) {
		this.valorAportes = valorAportes;
	}
	public double getCompraCripto() {
		return compraCripto;
	}
	public void setCompraCripto(double compraCripto) {
		this.compraCripto = compraCripto;
	}
	public double getVendaCripto() {
		return vendaCripto;
	}
	public void setVendaCripto(double vendaCripto) {
		this.vendaCripto = vendaCripto;
	}
	
	Acao(int receberQuantidadeAcessos, int receberQuantidadeAportes, double receberValorAportes, double receberCompraCripto, double receberVendaCripto, String receberNomeCompleto, String receberNomeUsuario, long receberCpf, String receberDataNascimento, long receberTelefone, String receberEndereco, int receberNivelInvestidor){
		super(receberNomeCompleto, receberNomeUsuario, receberCpf, receberDataNascimento, receberTelefone, receberEndereco, receberNivelInvestidor);
		this.setQuantidadeAcessos(receberQuantidadeAcessos);
		this.setQuantidadeAportes(receberQuantidadeAportes);
		this.setValorAportes(receberValorAportes);
		this.setCompraCripto(receberCompraCripto);
		this.setVendaCripto(receberVendaCripto);
		
		System.out.println("Nome completo: " + receberNomeCompleto +
				"\nNome Usuario: " + receberNomeUsuario + 
				"\nCPF: " + receberCpf +
				"\nData de nascimento: " + receberDataNascimento +
				"\nTelefone: " + receberTelefone +
				"\nEndereco: " + receberEndereco +
				"\nNivel de Investidor: " + receberNivelInvestidor +
				"\nQuantidade de acessos: " + receberQuantidadeAcessos +
				"\nQuantidade de aportes: " +  receberQuantidadeAportes+ 
				"\nValor dos aportes: " + receberValorAportes + 
				"\nValor de cripto comprada: " +  receberCompraCripto+ 
				"\nValor de cripto Vendida: " + receberVendaCripto);
	}
}
