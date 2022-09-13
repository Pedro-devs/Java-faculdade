import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc= new Scanner (System.in); 
    
     double base= 1;
     double topo=1;
     int N=1;
     double resul=1;
     
     System.out.println("Digite o numero de sequencias");
     int n = sc.nextInt();
     
     
     for(int i=0; i<n;i++){
       topo*=(N+1);
       base*=(N+2);
       N++;
       resul+= topo/base;
     }
     System.out.printf("%.2f", resul);
     }
}
//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
//quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.	


