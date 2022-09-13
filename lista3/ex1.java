import java.util.Scanner;
public class Main{
	
	public static int menor(int a,int b,int c){
		
	  int vetor[]= {a,b,c};
	  int menor=vetor[0];
			  
			  
	  for(int i=0;i<vetor.length;i++) {
		  if(vetor[i]<menor) {
			  menor=vetor[i];
		  }	  
	  }
	  
	  
	return menor;	
	}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("informe o valor de a");
		int a =sc.nextInt();
		System.out.println("informe o valor de b");
		int b =sc.nextInt();
		System.out.println("informe o valor de c");
		int c =sc.nextInt();
		System.out.println(menor(a,b,c));
		}
	}
//Fazer uma função que tem como parâmetro de entrada três números inteiros a, b, c e devolve (retorna)
//menor dentre os três números.
