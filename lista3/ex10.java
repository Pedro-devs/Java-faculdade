import java.util.Scanner;
public class Main
{
    public static String Categoria(int idade){
        String Categoria=" ";
      if((idade>=5)&&(idade<=7)){
         Categoria="Infantil A";
    }
    else if((idade>=8)&&(idade<=10)){
         Categoria="Categoria Infantil B";
    }
	else if((idade>=11)&&(idade<=13)){
	    Categoria="Categoria Juvenil A";
	}
	else if((idade >=14)&&(idade<=17)){
	    Categoria="Categoria Juvenil B";
	}
	else if(idade >=18){
	    Categoria="Adulto";
	} 
	return (Categoria);
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Informe a idade do nadador");
	int idade=sc.nextInt();
	System.out.println(Categoria(idade));
	
	}
}
// Faça uma função que recebe a idade de um nadador por parâmetro e retorna , também por parâmetro, a
//categoria desse nadador (tipo String) de acordo com a tabela abaixo:

