import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	pesoIdeal();
	}
	public static void pesoIdeal(){
	Scanner sc= new Scanner(System.in);
	System.out.println("Informe sua altura");
	double alt = sc.nextDouble();
	System.out.println("Informe o seu sexo [M]ou[F]");
	String sexo =sc.next();
	
	double pesohomem=(72.7*alt-58);
	double pesomulher=(62.1*alt-44.7);
	switch(sexo){
	    case "M" :
	    System.out.println("O seu peso ideal é : " + pesohomem );
	    break;
	    
	    case "F" :
	    System.out.println("O seu peso ideal é " + pesomulher);
	    break;
	    
	    default :
	    System.out.println("Valor invalido");
	}

}
}
