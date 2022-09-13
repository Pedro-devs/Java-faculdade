import javax.swing.JOptionPane;
public class Aa {

	public static void main(String[] args) {
	
		int x = Integer.parseInt(JOptionPane.showInputDialog("Escreva uma letra para x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Escreva uma letra para y"));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Escreva uma letra para z"));
		
		if (x == y && x == z){
			JOptionPane.showMessageDialog(null,"Três lados iguais . Trata-se de um Triangulo Equilatero");
		}else if(x == y || x == z){
			JOptionPane.showMessageDialog(null,"Dois lados iguais . Trata-se de um Triangulo Isosceles");
			}else 
			JOptionPane.showMessageDialog(null,"Três lados diferentes.");
			
}
}
//Dados 3 valores (possíveis lados) verificar se eles formam um triângulo, e em caso
//positivo, dizer se é equilátero, isósceles ou escaleno;


