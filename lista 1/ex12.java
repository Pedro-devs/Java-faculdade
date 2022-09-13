import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Informe um valor para L");
		int L = sc.nextInt();
		System.out.println("Informe um valor para R");
		int R = sc.nextInt();
		
		int  soma1=L*2;
		int  soma2=R*2;
		
		if(soma1>soma2){
		    System.out.println("Quadrado é maior que circulo de um raio R");
		}
		
		if(soma2>soma1){
		    System.out.println("Circulo de um raio R é maior que quadrado");
		}
	}
}
//Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado
//de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Círculo".
