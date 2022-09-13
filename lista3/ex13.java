import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	divisores();
	}
	public static void divisores(){
	Scanner sc= new Scanner(System.in);
	
        System.out.println("Escreva um número");
        int n1 = sc.nextInt();
        
        for(int i = n1; i>0;i--){//não pode fazer divisoes com zero
            if(n1%i==0){
                System.out.println(i);
	    
	    
	}
	}
	
    }
    }   