package teste;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a opção que desejar: "
				+ "\n\n1 Para instanciar um objeto do tipo Usuario"
				+ "\n\n2 Para instanciar um objeto do tipo Usuario e suas ações"
				+ "\n\n3 Para instanciar um objeto do tipo Usuario e sua conta"
				+ "\n\n4 Para instanciar um objeto do tipo Evento"
				+ "\n\n5 Para instanciar um objetvo do tipo Criptomoeda"
				+ "\n\n0 Para cancelar"
				));
		
		if(valor == 1) {
			new Usuario(
			(JOptionPane.showInputDialog("Digite o nome completo do Usuario: ")),
			(JOptionPane.showInputDialog("Digite o nome de Usuario: ")),
			(Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf sem pontos nem traços (ex:12345678910)"))),
			(JOptionPane.showInputDialog("Digite sua Data de Nascimento (ex: 01/01/2022): ")),
			(Long.parseLong(JOptionPane.showInputDialog("Digite o seu telefone (ex 1112345-1234): "))),
			("Digite o seu endereço: "),
			(Integer.parseInt(JOptionPane.showInputDialog("Digite o nivel de investidor (de 1 a 10): ")))
			);
			

		}else if (valor == 2){
			new Acao(		
					(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Acessos do usuario: "))),
					(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Aportes do Usuario: "))),
					(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos aportes do Usuario: "))),
					(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de cripto comprada: "))),
					(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de cripto vendida: "))),
					(JOptionPane.showInputDialog("Digite o nome completo do Usuario: ")),
					(JOptionPane.showInputDialog("Digite o nome de Usuario: ")),
					(Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf sem pontos nem traços (ex:12345678910)"))),
					(JOptionPane.showInputDialog("Digite sua Data de Nascimento (ex: 01/01/2022): ")),
					(Long.parseLong(JOptionPane.showInputDialog("Digite o seu telefone (ex 1112345-1234): "))),
					("Digite o seu endereço: "),
					(Integer.parseInt(JOptionPane.showInputDialog("Digite o nivel de investidor (de 1 a 10): ")))
					);
			
		}else if (valor == 3) {
			new Conta(
					(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "))),
					(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta: "))),
					(JOptionPane.showInputDialog("Digite o nome completo do Usuario: ")),
					(JOptionPane.showInputDialog("Digite o nome de Usuario: ")),
					(Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf sem pontos nem traços (ex:12345678910)"))),
					(JOptionPane.showInputDialog("Digite sua Data de Nascimento (ex: 01/01/2022): ")),
					(Long.parseLong(JOptionPane.showInputDialog("Digite o seu telefone (ex 1112345-1234): "))),
					("Digite o seu endereço: "),
					(Integer.parseInt(JOptionPane.showInputDialog("Digite o nivel de investidor (de 1 a 10): ")))
					);

		}else if (valor == 4) {
			new Evento(
			(JOptionPane.showInputDialog("Digite o nome do evento: ")),
			(Integer.parseInt(JOptionPane.showInputDialog("Digite a data do evento: "))),
			(JOptionPane.showInputDialog("Digite a descrição do evento: "))
					);

		}else if (valor == 5) {
			Criptomoeda criptomoeda;
			criptomoeda = new Criptomoeda(
			(JOptionPane.showInputDialog("Digite o nome da criptomoeda: ")),
			(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de criptomoeda: "))),
			(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da criptomoeda: ")))
			);

			criptomoeda.total(criptomoeda.getQuantidadeCripto(), criptomoeda.getValorCripto());
		}else if (valor == 0) {
			System.out.println("Programa finalizado!");
		}else {
			System.out.println("Rode o programa novamente e digite uma opção válida");
		}
		

	}

}
