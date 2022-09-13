import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Informe sua altura");
		float A= sc.nextFloat();
		System.out.println("Informe seu peso");
		float P= sc.nextFloat();
    	float calcule=(P/(A*A));
		
		if(calcule<26) {
		    System.out.println("Grau de obesidade é normal");
		}
		
		else if((calcule>=26) && (calcule<30)) {
		    System.out.println("Grau de obesidade é Obeso");
		}
		
		    
		
		else if(calcule>=30) {
		    System.out.println("Grau de obesidade é Obeso Mórbido");
		}
		
		
	
	}
}

