
public class Main
{//Crie uma função para unir dois vetores de mesmo tamanho e mesmo tipo em um terceiro vetor com dobro do tamanho.
	public static void main(String[] args) {
	dobrodoVetor();
	}
	public static void dobrodoVetor(){
	String nome1 []={"pedro","leonardo"};
	String nome2 []={"maycol","joao"};
	String nome3 []= new String [nome1.length];
	for(int i=0;i<nome1.length;i++){
	    System.out.print(nome3[i]=nome1[i]+" "+nome2[i]+ " ");
	    
	}
	}
}
