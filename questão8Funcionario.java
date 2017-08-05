package questão8;

public class Funcionario extends Pessoa{

	private float salario;
	
	public float calculaImposto() {
		salario = (float) (salario * 0.3);
		return salario;
	}

	@Override
	public void imprimeDados() {
		System.out.println(getNome());
		System.out.println(getNascimento());
		System.out.println(getSalario());
		System.out.println(calculaImposto());
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	
}
