import javax.swing.JOptionPane;
public class Aa {

	
	
public static void main(String[] args) {
		
		int escolha;
		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha alguma das seguintes opções: "  +  "\n"+"1) Instruçoes"+ "\n"+"2) Jogar" + "\n"+"3)Creditos"+"\n"+"4) Sair"));
			
			
		switch(escolha) {
		case 1:
			break;
			
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null,"Programa encerrado");
			break;
			default:
				JOptionPane.showMessageDialog(null,"Opção invalida");	
				
		}
		}while(escolha !=4);
		
			
				

		
}
}

//Crie um menu que permita o usuário escolher as seguintes opções para um
//jogo:

//1 – Instruções

//2 – Jogar

//3 – Créditos

//4 – Sair

//Utilize a estrutura switch dentro de um laço do-while, na implementação. O
//menu deixará de ser mostrado apenas quando o usuário escolher a opção 4 –
//Sair.

