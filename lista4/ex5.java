public class Main {
    public static void vetorMedia(int vetor[]){
        int soma=0;
        int media=0;
        for (int i=0; i<vetor.length;i++){
            soma=soma+vetor[i];// ou soma+=vetor[i];
            
        }
            media=soma/vetor.length;
        System.out.println("A média é "+(media));
    }

        public static void main(String args[]){
        int vetor[]={1,2,3,4,500};
        vetorMedia(vetor);//acessar função criada no começo do codigo return
        
        
}
}
//Dado um vetor de números inteiros, fazer um programa que imprima a média dos elementos do vetor
