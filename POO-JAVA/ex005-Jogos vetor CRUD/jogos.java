package Exercicios;



public class jogos {
	private String plataforma;// pra qual video game vai ser lançado
    private String nome;
    private String preco; //preço do jogo
  


   


    public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getPreco() {
		return preco;
	}





	public void setPreco(String preco) {
		this.preco = preco;
	}





	public String getPlataforma() {
		return plataforma;
	}





	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}





	public jogos(String nome, String preco, String plataforma) {
        this.nome = nome;
        this.preco = preco;
        this.plataforma = plataforma;
    }


 


    @Override
    public String toString() {
        return "jogos [nome = " + nome + ", preco = " + preco + ", plataforma = " + plataforma + "]";
    }
}