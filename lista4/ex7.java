import java.util.Scanner;
public class Main
{
    public static int multiplique(int n1,int vetor[]){
      int multiplique=0;
       
       for(int i=0;i<vetor.length;i++){
           
           System.out.println("v[" + (i+1) + "] X " + n1 + " = " + (vetor[i] * n1));
       }
     return (multiplique);   
    }
    
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Digite um valor");
	int n1=sc.nextInt();
	
	int vetor[]={1,2,3,4};
    multiplique(n1,vetor);
	
	
	}
}
//Dado um vetor de números inteiros e um número inteiro, fazer um programa que multiplique todos os
//elementos do vetor pelo número real dado e imprima o resultado