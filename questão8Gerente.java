package questão8;

public class Gerente extends Funcionario {

	private String area;

	public float calculaImposto() {
		setSalario((float) (getSalario() * 0.3));
		return getSalario();
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void imprimeDados() {
		System.out.println(getNome());
		System.out.println(getNascimento());
		System.out.println(getArea());
		System.out.println(getSalario());
	}
	
}
