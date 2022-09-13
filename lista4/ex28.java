
public class Main
{
	public static void main(String[] args) {
	
	int matriz[][]=new int[3][3];
	int soma=0;
	
	for(int i=0;i<matriz.length;i++){
	      soma=0;
	for(int j=0;j<matriz.length;j++){
	    matriz[i][j]=i;
	    soma=soma+j;
	
	}
	System.out.println();
	System.out.println("A soma da linha "+(i+1)+ " é:"+soma);
	}
	
	
	
}
}
//Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a soma dos
//elementos de cada linha da matriz