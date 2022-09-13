import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int senha=0;
    do{
      
       System.out.println("Insira a senha");
       senha=sc.nextInt();
       
       if(senha!=2002){
           System.out.println("Senha incorreta!");
       }
     
    }
    while(senha!=2002);
    System.out.println("Acesso permitido");
	}
}
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente
//deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta
//é o valor 2002. Utilize o laço que lhe for mais conveniente