import java.util.*;
public class Main {

    static String operacaoStr;
    static int tries;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Seu numero de tentativas é: " + tries);
            System.out.println("o número 2012 será representado em binario por:");

            System.out.println();
            
                    ArrayList<String> mylist = new ArrayList<String>();

           mylist.add("A) 11111011100");
           mylist.add("B) 1101110");
           mylist.add("C) 110111101");
           mylist.add("D) 1101111111");
           mylist.add("E) 110111");

                           
                     Collections.shuffle(mylist);
                   System.out.println("as questoes sao  : \n" + mylist);
                  
                   

                                           Collections.shuffle(mylist, new Random(3));
                   
                   

            System.out.println();

            System.out.println("Sua opção é ?");

            operacaoStr = sc.nextLine();

            switch(operacaoStr.toLowerCase()) {
            case "a":
                System.out.println("Resposta correta");
                System.exit(0);
                break;
            case "b":
                System.out.println("Resposta incorreta");
                tries++;
                break;
            case "c":
                System.out.println("Resposta incorreta");
                tries++;
                break;
            case "d":
                System.out.println("Resposta incorreta");
                tries++;
                break;
            case "e":
                System.out.println("Resposta incorreta");
                tries++;
                break;
            }
            if(tries == 3) {
                break;
            } else {
                continue;
            }
        }
        
        System.out.println("Programa finalizado!");
    }

}

//Utilizando Arrays, switch e do-while implemente uma questão de múltipla
//escolha referente a alguma das outras disciplinas que você está cursando neste
//semestre. Primeiro deverá ser apresentado o enunciado da questão com as 5
//opções/alternativas de resposta, que são (a), (b), (c), (d) e (e). Depois que o
//usuário escolher uma opção, se for a resposta correta deverá ser impresso
//“Resposta correta”, caso contrário “Resposta incorreta”. No caso de
//“Resposta incorreta” a questão deve ser apresentada novamente para outra
//tentativa, porém com as alternativas em outra ordem. Desta forma a cada nova
//tentativa de resposta as opções/alternativas são “embaralhadas”. A questão
//deixará de ser mostrada apenas quando a resposta correta for escolhida.