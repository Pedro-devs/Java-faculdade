import javax.swing.JOptionPane;
public class Aa {

	public static void main(String[] args) {
	
double n1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor à ser descontado"));
        
		if(n1>=300) {
			double desc = (n1*20)/100;
			double total= n1-desc;
			JOptionPane.showMessageDialog(null,"Sua compra deu um total de: " + total + " com desconto de: " + desc);
		}
		else if (n1<300) {
			double desc = (n1*15)/100;
			double total= n1-desc;
			JOptionPane.showMessageDialog(null,"Sua compra deu um total de: " + total + " com desconto de: " + desc);
		}
		
}
}
//Uma loja oferece para seus clientes um desconto de acordo com o valor da compra.
//Este desconto é de 20% se o valor da compra for maior ou igual a R$ 300,00 e 15% se
//for menor. Dado o valor do produto, mostre o valor (descontado) da compra do cliente
//e o valor do desconto obtido;
