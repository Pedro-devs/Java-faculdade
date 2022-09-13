package lista4;

public class ex12 {

	public static void main(String[] args) {
		int vetorA[]= {8,2,8,9,10};
		int vetorB[]= {1,2,3,4,5};
		int soma[]=new int [5];
		float media[]=new float [5];
		int somaM=soma[0];
		float mediaM= (vetorA[0]+vetorB[0]/2);
		
		
		for(int i=0; i<vetorA.length;i++) {
			soma[i]= vetorA[i]+ vetorB[i];
			media[i]= soma[i]/2;
			
			if(media[i]<mediaM) {
				mediaM=media[i];
			}
			
			if(soma[i]>somaM) {
				somaM=soma[i];
			}
		}
		System.out.println("A menor media é: "+mediaM);
		System.out.println("A maior soma é: "+somaM);
		

	}

}