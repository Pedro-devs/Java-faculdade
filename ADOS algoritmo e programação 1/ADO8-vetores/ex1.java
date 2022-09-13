
public class Main
{//função que copie o conteúdo de um vetor em um segundo vetor
 //VETOR É UMA COLEÇÃO DE VARIAVEIS DO MESMO TIPO, SAO VARIAS VARIAVEIS EM UMA SÓ E ACESSADA ATRAVES DO INDICE [i]
	public static void main(String[] args) {
	vetorCopiar();	
	}
	public static void vetorCopiar(){
	String nomes []={"pedro","leonardo"};
	String copiar[]= new String[nomes.length];
	    for(int i=0;i<nomes.length;i++){
	        copiar[i]=nomes[i];
	        System.out.println(copiar[i]);
	        
	    }
	    
}
}
//ou string nomes[]=new string[3];
//string[0]=pedro;
//string[1]=leonardo;


