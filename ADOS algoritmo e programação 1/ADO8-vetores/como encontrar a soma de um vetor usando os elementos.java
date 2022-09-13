
public class Main
{
	public static void main(String[] args) {
		int vetor[] ={2,2,2,2,2,4};
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
        soma=soma+vetor[i];//ou soma+=vetor[i]
        }
        System.out.println("Resultado da soma do vetor = "+soma);
	}
}
//Encontre a soma de um array usando um loop for em Java
