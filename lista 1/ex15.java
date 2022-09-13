import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("informe um numero para A");
		float A=sc.nextFloat();
		System.out.println("Informe um numero para B");
		float B=sc.nextFloat();
		System.out.println("Informe um numero para C");
		float C=sc.nextFloat();
		
		float delta=(B*2)-(4*A*C)/2*A;
		System.out.println(delta);
		
		if(delta<=0){
		    System.out.println("Impossível calcular");
		}
	}
}
//Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.
//Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de número negativo, mostre
//a mensagem correspondente “Impossível calcular”.
