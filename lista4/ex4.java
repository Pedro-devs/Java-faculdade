
public class Main
{
	public static void main(String[] args) {
	double vetor[]={0.33,0.65,1,2,3,4};
	double menor=vetor[0]; //ou double menor=999;
	
	for(int i=0;i<vetor.length;i++){
	    if(vetor[i]<menor){
	        menor=vetor[i];
	}
	}
	System.out.println("o menor é "+menor);
	
	
}
}

//Dado um vetor de números reais, fazer um programa que imprima o menor elemento do vetor.


