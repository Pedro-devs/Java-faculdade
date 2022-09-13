
public class Main
{
	public static void main(String[] args) {
	 
	    
	int a[]={3, 6, 7, 8, 1, 2, 5, 3, 9};
    
    for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
            System.out.println(a[i]);
        }
    }
     for(int i=0;i<a.length;i++){
        if(a[i]%2==1){
            System.out.println(a[i]);
        }   
     }
        
        
	}
}
//Fazer um programa que lê uma sequência de N números inteiros positivos e reordena os elementos da
//sequência de modo que todos os números pares venham primeiro e todos os ímpares em seguida. Por
//exemplo, para a sequência [3, 6, 7, 8, 1, 2, 5, 3, 9], a saída deverá ser: [6, 8, 2, 3, 7, 1, 5, 3, 9].