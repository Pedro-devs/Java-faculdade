import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int mat[][]=new int[4][4];
	int dp=0;//diagonal principal
	//Laço responsável por preencher a matriz com números que eu digitar e fazer ler
	for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
     System.out.print("Digite o elemento da linha " + (i + 1) + " da coluna " + (j + 1) + ": ");
     mat[i][j] = sc.nextInt();
     System.out.println("");
    }
    }
    
    //laço responsável por mostrar a matriz
    System.out.println("Agora, apresentando a matriz\n\n"); 
	for (int i = 0; i < mat.length; i++) { 
	for (int j = 0; j < mat[i].length; j++) {
	System.out.print(mat[i][j] + " ");
	} 
	System.out.println(""); 
	}
	//diagonal principal
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
    if(i==j){
    dp= dp + mat[i][j]; //ou d+=mat[i][j];
}
}
}
    System.out.println("Diagonal principal é: "+dp);	
	
}
}
//Faça um programa que leia uma matriz “mat” de
//tamanho 4 x 4, e imprima na tela a soma dos
//elementos abaixo da diagonal principal da
//matriz.