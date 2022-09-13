import java.util.Scanner;

public class Main { //classe = modelo para criaçao de um objeto

	public static void main(String []args) {
	apresentarMenu();
		
	}	
		
		
	public static void apresentarMenu() {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("1.Somar");
		System.out.println("2.Multiplicar");
		System.out.println("3.Subtrair");
		System.out.println("4.Dividir");
		System.out.println("5.Raiz quadrada ");
		System.out.println("6.Potencia");
		int menu=sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("Digite um valor para o primeiro numero ");
			int n1=sc.nextInt();
			System.out.println("Digite um valor para o segundo numero ");
			int n2=sc.nextInt();
			calcularSoma(n1,n2);
			System.out.println("Resultado da soma é: " + calcularSoma(n1,n2));
			break;
			
		case 2:
			System.out.println("Digite um valor para o primeiro numero ");
			int num1=sc.nextInt();
			System.out.println("Digite um valor para o segundo numero ");
			int num2=sc.nextInt();
			calcularMultiplicacao(num1,num2);
			System.out.println("Resultado da multiplicação  é: " + calcularMultiplicacao(num1,num2));
			break;
			
		case 3:
			System.out.println("Digite um valor para o primeiro numero ");
			int numm1=sc.nextInt();
			System.out.println("Digite um valor para o segundo numero ");
			int numm2=sc.nextInt();
			calcularSubtracao(numm1,numm2);
			System.out.println("Resultado da subtração  é: " + calcularSubtracao(numm1,numm2));
			break;
			
		case 4:
			System.out.println("Digite um valor para o primeiro numero ");
			double nun1=sc.nextInt();
			System.out.println("Digite um valor para o segundo numero ");
			double nun2=sc.nextInt();	
			calcularDivisao(nun1,nun2);
			System.out.println("Resultado da subtração  é: " +calcularDivisao(nun1,nun2));
			break;
			
		case 5:
			System.out.println("Digite um valor para o primeiro numero ");
			double nn1=sc.nextInt();
			System.out.println("Digite um valor para o segundo numero ");
			double nn2=sc.nextInt();	
			calcularRaiz(nn1,nn2);
			System.out.println("Resultado da subtração  é: " + calcularRaiz(nn1,nn2));
			break;
			
		case 6:
			System.out.println("Digite um valor para o primeiro numero ");
			double b=sc.nextInt();
			System.out.println("Digite um valor para o segundo numero ");
			double p=sc.nextInt();	
			calcularPotencia(b,p);
			System.out.println("Resultado da potenciação  é: " + calcularPotencia(b,p));
			break;
			
		default:
			System.out.println("Insira um valaor valido");
		}
		
		
	}
	public static int calcularSoma(int n1,int n2) {//esse int n1 e n2 sao os parametros é oque esta em parenteses 
		return (n1-n2);                            //sao variaveis que o metodo precisa receber para ser executado
	}                                              //pode receber ou nao variaveis
   
	public static int calcularMultiplicacao(int num1,int  num2) {
		return (num1*num2);
		
	}
	public static int calcularSubtracao(int numm1,int numm2) {
		return (numm1+numm2);
	}
	public static double calcularDivisao(double nun1,double nun2) {
		return(nun1/nun2);
	}
	public static double calcularRaiz(double nn1,double nn2) {
		return Math.sqrt(nn1)+Math.sqrt(nn2);
		
	}
	public static double calcularPotencia(double b,double p) {
		return Math.pow(b,p);
	}
}	



