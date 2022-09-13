import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	potencia();
	}
	public static void potencia(){
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Informe um valor para X");
	int x= sc.nextInt();    
	System.out.println("Informe um valor para Z");    
	int z= sc.nextInt();
	
	int resultado=1;
	for(int i=0;i<z;i++){
    resultado=resultado*x; //resultado=resultado*x;
	}
    System.out.println(resultado);
	    
}
}
