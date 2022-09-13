import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	 
	 Scanner sc= new Scanner (System.in); 
     double n=-2;
     double resul=1;
     int loop=0;
     
     System.out.println("De um numero");
     double n2=sc.nextDouble();
     
     while(loop<n2){
    resul += 1/n;
    if(n<0){
    n=(n*-1)+1;
    }
    else{
    n=(n+1)*-1;
    }
    loop++;
    }
     
    System.out.printf("%.2f", resul);
    
    }
     }
//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
//quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.