import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     
    System.out.println("Digite o tamanho do vetor");
    int tamanho=sc.nextInt();
    int vetor[]=new int[tamanho];
	
	for(int i=0;i<vetor.length;i++){
	    System.out.println("Digite o elemento "+(i+1));
	    vetor[i]=sc.nextInt();
	}
	
	
}
}

