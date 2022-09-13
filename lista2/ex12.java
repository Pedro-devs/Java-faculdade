import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
     double n2= 1;
     int negativo=0;
     double resul=0;
     
     System.out.println("Digite um numero");
     int n = sc.nextInt();
     System.out.println("Quantas vezes voce quer fazer a soma?");
     int loop=sc.nextInt();
     
     
    for(int i=0; i<loop;i++){
       resul+= n2/(n-negativo);
       negativo++;
       n2++;
       
    }
     
     System.out.println(resul);
    }
}
//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
//quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.


