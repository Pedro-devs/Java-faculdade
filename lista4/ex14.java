
public class Main
{
    public static void inverter(int a[],int b[],int c[]){
    
    for(int i=0;i<a.length;i++){
        if(i%2==0){
            c[i]=a[i];
            System.out.println(c[i]);
        }
        else{
            c[i]=b[i];
            System.out.println(c[i]);
        }
    }
    
    
    
    
    }
	public static void main(String[] args) {
	int a[]={1,2,4,4,5};
	int b[]={7,8,9,10,11};
	int c[]=new int[a.length];
	inverter(a,b,c);
}
}
//Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser
//composto, alternadamente, por um elemento do vetor A e outro do vetor B. Imprimir o vetor C.