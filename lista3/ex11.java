import java.util.Scanner;
public class Main
{
    
    public static String mediafinal(int media){
       String mediafinal=" ";
         
   if((media>=0)&&(media<=4.9)){
    	 mediafinal="Conceito : D";
	}
	if((media>=5)&&(media<=6.9)){
        mediafinal="Conceito : C";
	}
	if((media>=7)&&(media<=8.9)){
	  	 mediafinal="Conceito : B";
	}
	if((media>=9)&&(media <=10)){
	    mediafinal="Conceito : A";
	}
        
        
    return (mediafinal);  
    }
    
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
     int nota[]=new int[4];
     int soma=0;
     
     for(int i=0;i<nota.length;i++){
        
         System.out.println("Digite a nota da prova " + (i+1));
         nota[i]=sc.nextInt();
         soma=soma+nota[i];
         
 
     }
          int media=soma/4;
          System.out.println("A media final é "+ mediafinal(media));
     
	}
}
//Faça uma função que recebe a média final de um aluno por parâmetro e retorna o seu conceito, conforme
//a tabela abaixo:
