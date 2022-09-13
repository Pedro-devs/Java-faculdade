import javax.swing.JOptionPane;
public class Aa {

	public static void main(String[] args) {
	double n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para n1"));
	double n2=Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para n2"));
    double n3=Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para n3"));		
	double produto=n1*n2*n3;	
    JOptionPane.showMessageDialog(null,"O valor do produto dos 3 numeros digitados é:" + produto );
		
}	
}

//Dados 3 valores reais (float ou double) imprimir o valor do produto destes valores;


