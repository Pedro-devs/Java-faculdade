import javax.swing.JOptionPane;
public class Aa {

	public static void main(String[] args) {
	
		int n1= Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero de 1 até 7"));
	    
	    
	    switch(n1) {
	    
	    case 1 :
	    int n2= 1;
	    JOptionPane.showMessageDialog(null,"Hoje é Domingo");
	    break;
	    	
	    case 2 :
	    int n3= 2;
	    JOptionPane.showMessageDialog(null,"Hoje é : Segunda-feira");
	    break;
	    
	   
	    case 3 :
	    int n4= 3;	
	    JOptionPane.showMessageDialog(null,"Hoje é : Terça-feira");
	    break;
	    
	    case 4 :
	    int n5 = 4;
	    JOptionPane.showMessageDialog(null,"Hoje é : Quarta-feira");
	    break;
	    
	    case 5 :
	    int n6 = 5;
	    JOptionPane.showMessageDialog(null,"Hoje é : Quinta-feira");
	    break;
	    
	    case 6:
	    int n7 =6;
	    JOptionPane.showMessageDialog(null,"Hoje é : Sexta-feira");
	    break;
	    
	    case 7:
	    int n8=7;
	    JOptionPane.showMessageDialog(null,"Hoje é : Sabado");
	    break;
	    
	    default:
	    	JOptionPane.showMessageDialog(null,"Determine um valor valido");
	    	    			
        }

}
}
//Utilizando a instrução switch escreva um programa que recebe um valor inteiro de 1 a
//7 e retorna o correspondente dia da semana. Considere que 1 corresponde a domingo, 2
//a segunda-feira, ..., 7 a sábado. Além disso, no caso de uma entrada errada, como por
//exemplo 0, deve ser impresso “Valor inválido!”;