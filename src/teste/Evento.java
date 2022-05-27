package teste;

public class Evento {

	private String nomeEvento;
	private int dataEvento;
	private String descricaoEvento;
	
	
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public int getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(int dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getDescricaoEvento() {
		return descricaoEvento;
	}
	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}
	
	Evento(String receberNomeEvento, int receberDataEvento, String receberDescricaoEvento){
		this.setNomeEvento(receberNomeEvento);
		this.setDataEvento(receberDataEvento);
		this.setDescricaoEvento(receberDescricaoEvento);
		
		
		System.out.println("Nome do evento: " + receberNomeEvento +
				"\nData do evento: " + receberDataEvento + 
				"\nDescrição do evento: " + receberDescricaoEvento);
	}
	
	
	
}
