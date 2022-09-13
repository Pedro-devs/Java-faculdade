package lista4;

public class ex19 {

	public static void main(String[] args) {
		int vetor[]= {10,2,8,12,5};
		
		for(int i=0;i<vetor.length;i++) {
			if((i+1)%2!=0) {
				System.out.println(vetor[i]);
			}
		}

	}

}