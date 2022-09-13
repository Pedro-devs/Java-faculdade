import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Informe o valor de Kw consumido");
	float kw=sc.nextFloat();
	double[]kwh= new double[3];
	kwh[0]=  0.20;
	kwh[1]=  0.25;
	kwh[2]=  0.30;
	double p1 = (kwh[0] * kw);
	double p2 = (kwh[1] * kw);
	double p3 = (kwh[2] * kw);
	
	if ((kw >= 0)&&(kw <= 59.5)) {
	   System.out.println("O Valor mínimo da conta é 11,90");
	}
	else if((kw >59.5)&&(kw <150)) {
	    System.out.println("O valor da sua conta será "+p1);
	}
	}
	}
	

