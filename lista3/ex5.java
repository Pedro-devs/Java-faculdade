import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	baskara();
	}
	public static void baskara(){
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Informe um valor para a");
	int a = sc.nextInt();
	System.out.println("Informe um valor para b");
	int b = sc.nextInt();
	System.out.println("Informe um valor para c");
	int c = sc.nextInt();
	    
	double delta=(b*b)-4*a*c;
    System.out.println("Delta: "+delta);

	double raiz1=(-b+Math.sqrt(delta))/(2*a);
	double raiz2=(-b-Math.sqrt(delta))/(2*a);
	if(raiz1<raiz2){
	    System.out.println("A menor raiz é : " +raiz1);
	}
	else if(raiz2<raiz1){
	    System.out.println("A menor raiz é : " +raiz2);
	}    
    else{
        System.out.println("raiz real inexistente:-1");//Se não houver raízes reais, a função deve retornar o número −1.

    }
}
}


