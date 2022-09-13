
public class Main
{
    
    public static int produto(int vetor[]){
     int produto=1;
     
     for(int i=1;i<vetor.length;i++){
         produto=produto*vetor[i];
     }
      
       return (produto); 
    }
    
	public static void main(String[] args) {
	int vetor[]={1,2,3,4,5};
	System.out.println("o produto dos elementos é "+produto(vetor));
	
	}
}
//Dado um vetor de números inteiros, fazer um programa que imprima o produto dos elementos do vetor;