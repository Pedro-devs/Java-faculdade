import javax.swing.JOptionPane;
public class Aa {

	public static void main(String[] args) {
	
	int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 1 até 10"));
	
	for(int i=1;i<=10;i++) {
	JOptionPane.showMessageDialog(null,"A tabuada de " +n1+": "+n1*i);	
		
	}
}
}
//Dado um valor inteiro de 1 até 10, imprimir a “tabela” da tabuada deste valor;
