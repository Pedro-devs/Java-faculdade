import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
    double n=3;
    double S=1;
    double n2=2;
    int loop=0;
    
    System.out.println("De um numero");
     double n3=sc.nextDouble();
     
     while(loop<n3){
    
       S += n2/n;
       n+=2;
       n2+=2;
     
    loop++;
    }
     System.out.printf("%.2f", S);
    }
}
//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
//quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.

	


