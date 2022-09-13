
public class Main
{
	public static void main(String[] args) {
	
	int matriz[][]=new int [3][3];
	
	for(int i=0;i<matriz.length;i++){
	for(int j=0;j<matriz.length;j++){
	
	if(i%2==0){
	   matriz[i][j]=4;
	   System.out.print("|"+matriz[i][j]);
	}
	else{
	    matriz[i][j]=7;
	    System.out.print("|"+matriz[i][j]);
	}
	
	}
	System.out.println();
	}
	
}
}
//Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime
//cada elemento da matriz com o número 7, se a coluna for ímpar, e com 4 se a coluna for par.
