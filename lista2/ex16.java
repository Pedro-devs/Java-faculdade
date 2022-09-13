import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Insira a quantidade de valores a serem digitados: ");
	double valor=sc.nextInt();  
	
    int i=0;
    do{
    i++;  
    System.out.println("Insira um valor");
    int n1=sc.nextInt();
     
    if(n1%2==0){
        System.out.println("valor é par");
        System.out.println();
    }    
    else{
        System.out.println("Inpar");
        System.out.println();
    }
    if (n1 > 0) {
     System.out.println("positivo.");
     System.out.println();
    }

    else {
    System.out.println("negativo.");
    System.out.println();    
    }

    if (n1 == 0) {
    System.out.print("Nulo.");
    System.out.println();    
        
        
}
}
	while(i<valor);

   }
}
//Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida do usuário.
//Para cada valor lido, mostre uma mensagem em português dizendo se este valor lido é par (PAR), ímpar
//(ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu programa
//everá imprimir apenas NULO. Utilize o laço DO-WHILE.