/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
public static void vetor(double v[]) {
		double ccaux = 0;
		double soma = 0;
		double media = 0;
		for (int cc = 0; cc < v.length; cc++) {
			if (v[cc] % 2 == 0) {
				soma += v[cc];
				ccaux++;
			}
			media = (soma / ccaux);
			if (media < v[cc]) {
				System.out.println("Os números maiores que a media são: " + v[cc]);
			}
			}
		}
	
	
	public static void main(String[] args) {
		double v [] = {1.8, 2, 3453, 4, 5};
		vetor(v);
	}
}
//Dado um vetor de números reais, fazer um programa que imprima os números maiores do que a média
//dos elementos que estão nas posições pares do vetor