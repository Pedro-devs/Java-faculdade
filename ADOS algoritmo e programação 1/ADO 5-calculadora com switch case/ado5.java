import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
	    float n1=sc.nextFloat();
	    System.out.println("Informe o segundo valor");
	    float n2=sc.nextFloat();	    
	    System.out.println("1 Soma   2- Subtração		3 - Multiplicação    	4 - Divisão");
        int cont=sc.nextInt();

	    switch (cont) {
	        case 1 :
	            float soma = n1+n2;
	            System.out.println(soma);
	            break;
	            
	        case 2 :
	            float sub = n1-n2;
	            System.out.println(sub);
	            break;
	            
	        case 3 :
	            float mult = n1*n2;
	            System.out.println(mult);
	        break;
	        
	        case 4 :
	            float div = n1/n2;
	            System.out.println(div);
	            break;
	            
	        default :
	        System.out.println("Determine um valor valido");
	    }
	    
	}
}
