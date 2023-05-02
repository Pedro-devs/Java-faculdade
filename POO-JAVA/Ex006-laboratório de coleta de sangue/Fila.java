package EstudarJava;

import java.util.LinkedList;

public class Fila {
    
    private LinkedList<String> fila = new LinkedList<String>();// A LinkedList tem melhor desempenho em operações que envolvem a remoção de elementos no meio da lista, enquanto o ArrayList tem melhor desempenho em operações que envolvem o acesso aos elementos por índice digitando o nome por exemplo para pesquisar .
    
    public void adicionarPaciente(String paciente) {
    	System.out.println("Paciente adicionado");
        fila.addLast(paciente);
    }
    
    public String removerPaciente() {
        if (fila.isEmpty()) {             //método utilizado para verificar se uma determinada
        return "Não há pacientes na fila.";//coleção de elementos, como uma lista, um array,
        	                               //uma pilha,uma fila ou um conjunto, está vazia.
            
        } else {
        	System.out.println("Paciente removido");
            return fila.removeFirst();
        }
    }
    public String listarPacientes() {
        if (fila.isEmpty()) {
            return "Não há pacientes na fila.";
        } else {
            StringBuilder sb = new StringBuilder();//metodo poderoso que permite a modificaçao
            for (String paciente : fila) { //da nossa lista elementos, adicionando caracteres dentro
                sb.append(paciente + ", ");//nesse caso adicionei virgula apos um nome ser adicionado, 
            }                           // é mais eficiente do que concatenar strings usando o operador "+" porque usa muito mais desempenho
            sb.delete(sb.length()-2, sb.length()); // Remove a última vírgula e espaço do tamanho do objeto
            return sb.toString();
        }
    }
    
    public int tamanho() {
        return fila.size();
    }
}
