package lista4;
import java.util.Scanner;
public class ex21 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De a quantidade de alunos na sala: ");
		int n=sc.nextInt();
		int media=0;
		
		String nomes[]= new String[n];
		float notas[]= new float [n];
		
		for(int i=0;i<nomes.length;i++) {
			System.out.println("Informe o nome do aluno: ");
			nomes[i]=sc.next();
			System.out.println("Informe a nota do aluno: ");
			notas[i]=sc.nextFloat();
			media+=notas[i];
		}
		
		System.out.println("A media da sala é "+(float)media/n+" com os alunos acima da media sendo: ");
		media= media/n;
		
		for(int i=0;i<nomes.length;i++) {
			if(notas[i]>media) {
				System.out.println(nomes[i]);
			}
		}
		

	}

}