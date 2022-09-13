import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Insira um valor para saber seus divisores: ");
	int n1=sc.nextInt();
	
	  
	
	for(int i=1;i<=n1;i++){
	    if(n1%i==0){
	     System.out.println("Os divisores de "+n1+" são: "+i); 
	}
	}
	
	
	}
}
//Ler um número inteiro N e calcular e imprimir todos os seus divisores. Exemplo: para o número 6, temos os
//seguintes divisores 1, 2, 3, 6. Utilize o laço que lhe for mais conveniente.