import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Informe um valor para n1");
	    float n1 = sc.nextFloat();
	    System.out.println("informe um valor para n2");
		float n2 = sc.nextFloat();
	    float resultado=n1/n2;
	        float resto=n1%n2;
	        if (resto == 0) {
	            
	            System.out.println("A divisão do numero " +n1+ " por numero " +n2+ " é exata");
	       }     
	        else if (resto != 0) {
	          
	            System.out.println("A divisão do numero " +n1+ " por numero " +n2+ " não é exata");
	           
	       }
 	       }
           }
		   

