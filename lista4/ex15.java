
public class Main
{   
   public static void sequencia(int a[]) {
		int cc = 0;
		int i = 0;
		int aux = 0;
		for (cc = 0; cc < a.length; cc++) {
			for (i = 0; i< a.length; i++) {
				if (a[cc] < a[i]) {
					aux = a[cc];
					a[cc] = a[i];
					a[i] = aux;
				}
			}
		}
		for (int ci = 0; ci < a.length; ci++) {
			System.out.println(a[ci]);
		}
	}
	public static void main(String[] args) {
		int a [] = {1, 4, 13, 56, 2, 100};
		sequencia(a);
	}

}
//Dado um vetor de números inteiros, fazer um programa que imprima o vetor em ordem crescente.
