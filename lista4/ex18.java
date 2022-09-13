import java.util.Scanner;
public class Main
{
    
    public static int verificar(int vetor[],int n1){
      int verificar=0;  
      
      for(int i=0;i<vetor.length;i++){
         if(n1==vetor[i]){
            System.out.println("O numero está no vetor e a posição é " +(i+1)); 
            
         }
        
      }
   
      return (verificar);  
    }

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Insira um valor");
	int n1=sc.nextInt();
	
	int vetor[]={1,2,3,4,5,6,7};
	verificar(vetor,n1);
	    
	}
	}
//Fazer um programa que verifica se determinado número dado está dentro de um vetor também dado.
//Caso esteja, imprimir a posição em que o número foi encontrado.
