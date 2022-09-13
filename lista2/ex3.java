import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int vetor[]=new int[10];
	int maior=vetor[0];
	
	for(int i=0;i<10;i++){
	    System.out.println("digite um numero"); //laço para ler os numeros que a pessoa digitar 
	    vetor[i]=sc.nextInt();                  // e armazenar no vetor
	}
	
    for(int i=0;i<vetor.length;i++){     //laço que pega os numeros que digitamos e mostra o maior numero
        if(vetor[i]>maior){
            maior=vetor[i];
            
            
    }
    }
	System.out.println("o maior valor é " + maior);
	
	}
}
//Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu programa deve determinar
//e imprimir o maior deles. Use o laço FOR.