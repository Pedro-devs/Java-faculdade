import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Digite a quantidade de alunos");
	int alunos=sc.nextInt();
	
	float soma=0;
	int i=0;
	while(i<alunos){
	    System.out.println("Informe a nota do aluno "+"["+(i+1)+"]");
	    int nota=sc.nextInt();
	    
	    i++;
	    soma=soma+nota;
	    
	}
	float media=soma/i;
	System.out.println("a media da sala é "+media );

	}
}
//Escreva um programa para ler a quantidade de alunos existentes em uma turma. Depois disso, o programa
//deve ler as notas de cada um destes alunos, calcular e mostrar na tela a média aritmética destas notas.
//Utilize o laço WHILE.