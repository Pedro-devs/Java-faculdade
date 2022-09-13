import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Informe um valor para a base");
		int base=sc.nextInt();
		System.out.println("Informe um valor para o expoente");
		int expo=sc.nextInt();
		
		System.out.println(Math.pow(base,expo));
		
	}
}
//Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
//expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
//Math.pow(5, 3). Você pode trocar esses números por variáveis.
