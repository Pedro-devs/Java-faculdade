import javax.swing.JOptionPane;
public class Aa {

	
	
		public static void main(String[] args) {
			
			String letra=  JOptionPane.showInputDialog("Selecione uma letra : (A) , (B), (C) OU (D)");
			  
			  switch(letra) {
			  
			  case "A" :
				  String l1="A";
				  JOptionPane.showMessageDialog(null,"Resposta correta");
				  break;
				  
			  default:
			    	JOptionPane.showMessageDialog(null,"Resposta errada!");    
			  }		    

			  
			  
}
}
//Implemente uma questão de múltipla escolha referente a alguma das outras disciplinas
//que você está cursando neste semestre. Primeiro deverá ser apresentado o enunciado da
//questão com as 5 opções/alternativas de resposta, que são (a), (b), (c), (d) e (e). Depois
//que o usuário escolher uma opção, se for a resposta correta deverá ser impresso
//“Resposta correta”, caso contrário “Resposta incorreta”. Utilize a instrução switch,
//invés de if, na implementação.
