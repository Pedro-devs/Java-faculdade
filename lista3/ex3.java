import java.util.Scanner;
public class Main{
	
	public static int fatorial(int n1) {
	int fatorial=1;
		
	for(int i=1;i<=n1;i++) {
		fatorial=fatorial*i;
		
	}
		return fatorial;
	}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Informe um valor");
		int n1=sc.nextInt();
		System.out.println(fatorial(n1));
		

	}
	}
//Fazer uma função chamada fatorial que tem como parâmetro de entrada um número inteiro positivo n
//e fornece como saída o fatorial desse número.
//Exemplo: se N for 5, a função deve retornar 120, que é a multiplicação de 1 * 2 * 3 * 4 * 5