import java.util.Scanner;
public class Main
{
    public static int fatorial(int n1){
    int fatorial=1;
    
    for(int i=1;i<=n1;i++){
        fatorial=fatorial*i;
    }
    
    return (fatorial);    
    }
    
    public static int somatoria(int n1){
    int somatoria=0;
    
    for(int i=0;i<=n1;i++){
        somatoria=somatoria+i;
    }
    
    return (somatoria);
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Insira um valor");
	int n1=sc.nextInt();
	System.out.println("o fatorial de "+n1+" é " +fatorial(n1));
	System.out.println("a somatoria de "+n1+" é " +somatoria(n1));
	System.out.println("o fatorial dividido pela somatoria é "+fatorial(n1)/somatoria(n1));
	}
}

