import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int vetor[]={1,2,3,4,5};
	System.out.println("Informe um valor");
	double n1=sc.nextInt();
	System.out.println();
	
	for(int i=0;i<vetor.length;i++){
	    if(vetor[i]%2==1){
	       System.out.println("["+(i+1)+"] * " + n1 + " = " + (vetor[i] * n1));
	       
	        
	        
	}
	}
     
}
}
//Dado um vetor de números reais e um número real, fazer um programa que multiplique os elementos de
//posição ímpar do vetor pelo número real dado e imprima o resultado.
