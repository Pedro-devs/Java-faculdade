import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Informe o tamanho do vetor"); //descobrir o tamanho do vetor
	int tamanho=sc.nextInt();
	
	int vetor[]=new int[tamanho];//variaveis criadas
	int maior=vetor[0];
	int menor=999;
	
    for(int i=0;i<vetor.length;i++){
        System.out.println("Digite o numero ");//laço que coloca os elementos dentro do vetor
        vetor[i]=sc.nextInt();
    }
	
	for(int i=0;i<vetor.length;i++){ //laço que mostrará o maior e menor  valor do vetor
	    if(vetor[i]>maior){
	       maior=vetor[i];
	       
	    if(vetor[i]<menor){
	       menor=vetor[i]; 
	}   
	}
	}
    System.out.println("O maior valor do vetor é "+maior);
    System.out.println("O menor valor do vetor é "+menor);


	}
}
//faça um programa que peça o tamanho do vetor e preencha os elementos do vetor e depois mostre o menor 
// e maior valor dos elementos 