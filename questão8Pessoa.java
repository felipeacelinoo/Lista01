package questão8;

public abstract class Pessoa {

	private String nome;
	private Data nascimento;
	
	public abstract void imprimeDados();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}

	
}
