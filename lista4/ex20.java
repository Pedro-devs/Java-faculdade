
public class Main
{
    public static int multiplos(int a[],int b[]){
    int multiplos=0;  
    
    for(int i=0;i<a.length;i++){
	    b[i]=a[i]*3;
	    if(b[i]%2==1){
	       System.out.println(b[i]);   
	    }
	    }
        
        
        return (multiplos);
    }
	public static void main(String[] args) {
	int a[]={1,2,3,4,5,6};
	int b[]=new int[a.length];
    multiplos(a,b);
	}
}
//Dado um vetor de números inteiros, fazer um programa que copie para outro vetor os número que são
//múltiplos de 3. Caso existam, imprimir os elementos que estão nas posições ímpares desse vetor