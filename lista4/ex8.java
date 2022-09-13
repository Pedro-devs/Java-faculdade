import java.util.Scanner;
public class Main
{
    public static int verificar(int vetor[],int n1){
        int verificar=0;
        for(int i=0;i<vetor.length;i++){
            if(n1==vetor[i]){
            System.out.println("O valor inserido está no vetor");    
        }
        }
        
        return (verificar);
    }
    
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Digite um valor");
    int n1=sc.nextInt();
    
    int vetor[]={1,2,3,4};
    verificar(vetor,n1);
    
	}
}
//Dado um vetor de números inteiros e um número inteiro, fazer um programa que verifique se o número
//está presente no vetor.