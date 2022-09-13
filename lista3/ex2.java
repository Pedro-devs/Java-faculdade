import java.util.Scanner;
public class Main
{
    public static int somatoria(int n1){
    int somatoria=0;
    
    for(int i=0;i<=n1;i++){
    somatoria=somatoria+i;   
        
    }    
    
    return (somatoria);   
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Informe o valor para n1");
	int n1=sc.nextInt();
	System.out.println(somatoria(n1));
	}
}
//Fazer uma função chamada somatoria que tem como parâmetro de entrada um número inteiro positivo
//N e fornece como saída a soma de todos os números inteiros positivos menores ou iguais a N.
//Exemplo: se N for 3, a função deve retornar 6, que é a soma de 1 + 2 + 3.

