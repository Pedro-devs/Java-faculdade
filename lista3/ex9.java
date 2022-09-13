import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	mostrarIdade();
	}
	
	public static void mostrarIdade(){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe sua idade em anos");
	int idade = sc.nextInt();
    System.out.println("Quantos meses?");
    int meses= sc.nextInt();
    System.out.println("Quantos dias ? ");
    int dias= sc.nextInt();
    
    int id = (idade*365);
	int me = (meses*30); //considerando que um mes normal tenha 30 dias
	float resultado = (id+me+dias);
	System.out.println("Você viveu " + resultado + " ,dias");
	
	    
	    
	    
	}
}

