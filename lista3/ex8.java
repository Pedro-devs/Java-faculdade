import java.util.Scanner;
public class Main
{
    public static boolean mostrarboolean(int n1){
    boolean par=true;
    if(n1%2==0){
        System.out.println(par);
    }
    else{
        par=false;
        System.out.println(par);
    }
    return par;
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Insira um valor");
    int n1=sc.nextInt();
    mostrarboolean(n1);
    
	}
}
