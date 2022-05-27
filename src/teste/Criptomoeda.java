package teste;

public class Criptomoeda {
		
	
	private double quantidadeCripto;
	private String nomeCripto;
	private double valorCripto;

	
	public double getQuantidadeCripto() {
		return quantidadeCripto;
	}
	public void setQuantidadeCripto(double quantidadeCripto) {
		this.quantidadeCripto = quantidadeCripto;
	}
	public String getNomeCripto() {
		return nomeCripto;
	}
	public void setNomeCripto(String nomeCripto) {
		this.nomeCripto = nomeCripto;
	}
	public double getValorCripto() {
		return valorCripto;
	}
	public void setValorCripto(double valorCripto) {
		this.valorCripto = valorCripto;
	}
	
	void total (double valorTotal, double quantidadeTotal){
		double total;
		total = valorTotal * quantidadeTotal;
		
		System.out.println("O valor total dessa criptomoeda é: " + total);
	}
	
	Criptomoeda(String receberNomeCripto, double receberQuantidadeCripto, double receberValorCripto){
		this.setQuantidadeCripto(receberQuantidadeCripto);
		this.setNomeCripto(receberNomeCripto);
		this.setValorCripto(receberValorCripto);
		
		System.out.println("Nome da sua criptomoeda: " + receberQuantidadeCripto + 
				"\nQuantidade da sua criptomoeda: " +receberNomeCripto  +
				"\nValor da criptomoeda: " + receberValorCripto);
		
		
	}

}

