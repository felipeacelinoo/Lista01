package questão2;

public class Pessoa {

	private String nome;
	private String idade;
	private double altura;
	private double peso;
	private String sexo;
	
	public Pessoa() {
		this.nome = "Não mencionado";
		this.idade = "0";
		this.altura = 0;
		this.peso = 0;
		this.sexo = "Não mencionado";
	}
	
	public Pessoa(String nome, String idade, double altura, double peso, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	public double calcImc(double peso, double altura) {
		
		double imc = peso / (altura * 2);
		return imc;
	}
	
	public String toString() {
		
		if (calcImc(this.peso, this.altura) <= 18.5) {
			return "IMC " + calcImc(this.peso, this.altura) + " = Abaixo do peso normal";
		} else if (calcImc(this.peso, this.altura) <= 25) {
			return "IMC " + calcImc(this.peso, this.altura) + " = Peso normal";
		} else if (calcImc(this.peso, this.altura) <= 30) {
			return "IMC " + calcImc(this.peso, this.altura) + " =  Acima do peso normal";
		} else if (calcImc(this.peso, this.altura) > 30) {
			return "IMC " + calcImc(this.peso, this.altura) + " = Obesidade";
		}
	
		return null;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
}
