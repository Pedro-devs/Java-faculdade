import javax.swing.JOptionPane;
public class Aa {

	public static void main(String[] args) {
	
int ano =Integer.parseInt(JOptionPane.showInputDialog("Digite um ano para saber se é bissexto"));
       
        
        // se o ano for maior que 400
        if(ano % 400 == 0){
            JOptionPane.showMessageDialog(null,ano + " é bissexto.");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            JOptionPane.showMessageDialog(null, ano + " é bissexto.");
        } else{
            JOptionPane.showMessageDialog(null,ano + " não é bissexto");
					
	}
        
}
}
//Dado um ano com 4 dígitos dizer ser ele é um ano bissexto ou não. (Lembre-se que um
//ano é bissexto se ele for divisível por 400 ou se ele for divisível por 4 e não por 100.)