
public class Main
{
	public static void main(String[] args) {
	int vetor[]={1,2,3,4,5,6,7,8,9};
    int matriz[][]=new int[3][3];
	int contador=0;
	
	for(int i=0;i<matriz.length;i++){
	for(int j=0;j<matriz[i].length;j++){
	
	  
	    matriz[i][j]=vetor[contador];
	    contador++;
	}
	}
		for(int i=0;i<matriz.length;i++){
	for(int j=0;j<matriz[i].length;j++){
	    
	    System.out.print("|"+matriz[i][j]);
	   
	    
	}
	System.out.println();
	}
	
	
	
	}
}
