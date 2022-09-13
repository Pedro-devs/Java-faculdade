import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int mat[][]=new int[2][3];
	int soma=0;
	
	//Laço responsável por preencher a matriz com números que eu digitar e fazer ler
	for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
     System.out.print("Digite o elemento da linha " + (i + 1) + " da coluna " + (j + 1) + ": ");
     mat[i][j] = sc.nextInt();
     System.out.println("");
    }
    }
    
    //laço responsável por mostrar a matriz
    System.out.println("Agora, apresentando a matriz\n\n"); 
	for (int i = 0; i < mat.length; i++) { 
	for (int j = 0; j < mat[i].length; j++) {//colocamos mat[i]pra acessar os elementos que a pessoa digitou
	System.out.print(mat[i][j] + " ");
	} 
	System.out.println(""); 
	}
    
    //laço responsável por fazer a soma de todos os elementos da  matriz
    for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[i].length;j++){
    soma=soma+mat[i][j];//ou soma+=mat[i][j];
    }
    }
    System.out.println("a soma de tudo é :"+soma);
    
}
}
//Faça um programa que leia uma matriz “mat” de
//tamanho 2 x 3 e imprima na tela a soma de
//todos os elementos da matriz.


