import javax.swing.JOptionPane;
public class Aa {

	
	
public static void main(String[] args) {
boolean tacerto = false; 
int tentativas=0; //numero de tentativas tipo nosso contador
do {		
String letra=  JOptionPane.showInputDialog("Selecione uma letra : (A) , (B), (C) , (D) OU  (E)");
tentativas++;	  
switch(letra) {

case "A" :
  String l1="A";
  JOptionPane.showMessageDialog(null,"Resposta correta");
  tacerto=true;
		  break;
		  
  default:
  JOptionPane.showMessageDialog(null,"Resposta errada!");    
   }	

	
}while(!tacerto );
if(tentativas>2) {
	System.out.println("Resposta incorreta nas 3 tentativas");
}

System.out.println("o numero de tentativas : " + tentativas);

}
}
//Utilize a instrução switch e o laço/loop do-while para implementar uma
//questão de múltipla escolha referente a alguma das outras disciplinas que você
//está cursando neste semestre. Primeiro deverá ser apresentado o enunciado da
//questão com as 5 opções/alternativas de resposta, que são (a), (b), (c), (d) e (e).
//Depois que o usuário escolher uma opção, se for a resposta correta deverá ser
//impresso “Resposta correta”, caso contrário “Resposta incorreta”. No caso de
//“Resposta incorreta” a questão deve ser apresentada novamente para outra
//tentativa. Deve ser permitido no máximo 3 tentativas, quando a resposta
//correta for escolhida deve ser informado em qual tentativa isso ocorreu, caso
//isso não ocorra em nenhuma das 3 tentativas deve ser impresso “Resposta
//incorreta nas 3 tentativas”.

