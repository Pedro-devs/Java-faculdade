import java.util.Scanner;
public class Main
{
    public static double volume(double x){
	double volume=(4.0/3)*3.14*(x*x*x);

	return volume;
    }
	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
	System.out.println("Informe o raio da esfera");
	double x = sc.nextDouble();
	System.out.println("o volume da esfera é "+ volume(x));
}	
}

