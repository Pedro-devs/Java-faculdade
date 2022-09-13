import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double A, B, C, A2, B2, C2;
		System.out.println("Informe um valor para A");
		A = input.nextDouble();
		System.out.println("Informe um valor para B");
		B = input.nextDouble();
		System.out.println("Informe um valor para C");
		C = input.nextDouble();

		

		A2 = A*A;
		B2 = B*B;
		C2 = C*C;

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if ((A2) == (B2 + C2)) {
			System.out.println("TRIANGULO RETANGULO");
		}
		else if ((A2) > (B2 + C2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if ((A2) < (B2 + C2)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		else if ((A == B) & (B == C)) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if ((B == C)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
	}
}
