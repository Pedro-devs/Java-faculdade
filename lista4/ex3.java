
public class Main
{
	public static void main(String[] args) {
	int vetor[]={1,2,3,4};
	int maior=vetor[0];
	   
	   for(int i=0;i<vetor.length;i++){
	       if(vetor[i]>maior){
	         maior=vetor[i];  
	   }
	   }
	   System.out.println("O maior valor é "+maior);
}
}

//Dado um vetor de números inteiros, fazer um programa que imprima o maior elemento do vetor.



