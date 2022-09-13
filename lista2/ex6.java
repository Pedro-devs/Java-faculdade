import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    
    String nomevelho=" ";
    int idadevelho=0;
    String sexovelho=" ";
    
    int i=0;
    do{
        i++;
        
        System.out.println("Informe o nome do aluno "+"["+i+"]");
        String nome=sc.next();
        
        System.out.println("Informe a idade do aluno "+"["+i+"]");
        int idade=sc.nextInt();
        
        System.out.println("Informe o sexo do aluno [M/F] "+"["+i+"]");
        String sexo=sc.next();
        
        if(idade>idadevelho){
           idadevelho=idade;
           nomevelho=nome;
           sexovelho=sexo;
        }
        
    }
   
    while(i<5);
    System.out.println("Os dados do aluno mais velho :");
    System.out.println("Nome: "+nomevelho+", sexo: " + sexovelho+", idade: "+ idadevelho);
}
}
//Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados como
//nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE.
