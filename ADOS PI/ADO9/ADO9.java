import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args){
    Random rd=new Random();
    Scanner sc=new Scanner(System.in);
   System.out.println("Digite o primelro valor");
   int max=sc.nextInt();
   System.out.println("Digite o segundo valor");
   int min=sc.nextInt();
              
   int equa=rd.nextInt(((max-min)+ 1)+min);
   
   //Formula
   int ax, b;
   ax=equa;
   if(ax==0)
       return;
   b=equa;
   //Resolve equao
  int resp= -ax/b;
  System.out.println(resp);
	
}
}
//Uma equação do 1º grau é da forma ax + b = 0, com a ≠ 0. Utilizando a classe
//Random (.nextInt((max - min) + 1) + min;) ou o método random
//((Math.random() * ((max - min) + 1)) + min;) implemente um programa que
//receba do usuário os valores min e max, escolha aleatoriamente os valores de
//a e b no intervalo [min, max], exiba a equação ax + b = 0, e mostre a solução
//correspondente.

