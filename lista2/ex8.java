
public class Main
{
	public static void main(String[] args) {
	int soma=0;
	int contador=0;
	for(int i=13;i<=73;i++){
	    if(i%2==0){
	       soma=soma+i; //temos que criar uma variavel soma para fazer a media aritmetica
	       contador=contador+1;// e o contador pra ser dividido pela soma para fazer a media 
	       //temos que criar a soma e o contador pra fazer uma media aritmetica
	    }
     	}
     	double media=soma/contador;
     	System.out.println("a media é "+media);
	
	
	}
}
//Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. Utilize o laço que
//lhe for mais conveniente