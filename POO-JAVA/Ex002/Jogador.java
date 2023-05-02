package Exercicios;

public class Jogador {

	public String nome;
	public float peso;
	public float altura;
	public int idade;
	public String posicao;
	public String nacionalidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int faltaPraAposentar() {
		int anosPraAposentar = 0;

		if ("defesa".equals(this.posicao)) { // Em Java, para comparar String, é necessário usar o método equals() ou
												// equalsIgnoreCase().
			anosPraAposentar = 40 - idade;
		}

		if ("meio-campo".equals(this.posicao)) {
			anosPraAposentar = 38 - idade;
		}

		if ("atacante".equals(this.posicao)) {
			anosPraAposentar = 35 - idade;
		}

		return (anosPraAposentar);

	}

	public void imprimirDados() {

		System.out.println("Nome do jogador : " + nome);
		System.out.println("Peso do jogador : " + peso);
		System.out.println("Idade do jogador : " + idade);
		System.out.println("Altura do jogador : " + altura);
		System.out.println("Posição do jogador : " + posicao);
		System.out.println("Nacionalidade do jogador : " + nacionalidade);
		System.out.println("Quantidade de anos que faltam pra aposentar : " + faltaPraAposentar());

	}

}
