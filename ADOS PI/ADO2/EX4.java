import javax.swing.JOptionPane;
public class Aa {

	public static void main(String[] args) {
	
		String exemplo = JOptionPane.showInputDialog("escreva algo");
		int stringlength = exemplo.length();
		JOptionPane.showMessageDialog(null, "comprimento da string :" + stringlength);
}
}

//Dado um nome (String) não composto, imprimir a quantidade de caracteres deste nome.

