import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	Random gerador=new Random();
	int caixa=0;
	int n1=0;
	int n2=0;
	int n3=0;
	int n4=0;
	int n5=0;
	int n6=0;
	for(int i=0;i<1000000;i++){
	  caixa=0;
	  caixa=gerador.nextInt(6);
	  caixa++;
	    
	if(caixa==1){
	   n1++;
	}
	
	if(caixa==2){
	    n2++;
	}
	if(caixa==3){
	    n3++;
	}
	if(caixa==4){
	    n4++;
	}
	if(caixa==5){
	    n5++;
	}
	if(caixa==6){
	    n6++;
	}
	    
	    
	    
	} 
	System.out.printf(" o numero de vezes que o 1 apareceu foi:%d%n ",n1);
	System.out.printf("o numero de vezes que o 2 apareceu foi: %d%n ",n2);
	System.out.printf("o numero de vezes que o 3 apareceu foi: %d%n ",n3);
	System.out.printf("o numero de vezes que o 4 apareceu foi: %d%n ",n4);
	System.out.printf("o numero de vezes que o 5 apareceu foi: %d%n ",n5);
	System.out.printf("o numero de vezes que o 6 apareceu foi: %d%n ",n6);
	}
	}

//Utilizando a classe Random (java.util.Random) ou o método random
//(Math.random()) implemente um programa que simule o lançamento de 1
//dado de 6 faces 1.000.000 (1 milhão) de vezes consecutivas. Ao final
///apresente a porcentagem de vezes que cada face apareceu, lembrando que a
//soma de todas as porcentagens será 100% (aproximadamente).