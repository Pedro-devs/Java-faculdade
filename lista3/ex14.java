import java.util.Scanner;
public class Main
{
    
    public static void soma(int a,int n){
    int soma=0;
    soma=n+n+a;   
    System.out.println(soma);
    
    if(n<=0){
	System.out.println("-1");
	}
	
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Insira um valor para A");
	int a=sc.nextInt();
	System.out.println("Insira um valor para N");
	int n=sc.nextInt();
	soma(a,n);
	}
}
