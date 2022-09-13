
public class Main
{
    public static void juntarTudo(int a[],int b[],int c[]){
       for(int i=0;i<a.length;i++){
           c[i]=a[i];
           System.out.println(c[i]);
       }
       for(int i=0;i<b.length;i++){
           c[i]=b[i];
           System.out.println(c[i]);
       }
        
    }
	public static void main(String[] args) {
	int a[]={1,2};
	int b[]={3,4};
	int c[]=new int[a.length];
	juntarTudo(a,b,c);
	
}
}
//Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser
//composto pelos elementos do vetor A e depois pelos elementos do vetor B. Imprimir o vetor C