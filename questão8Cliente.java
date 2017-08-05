package questão8;

public class Cliente extends Pessoa {

	private int codigo;
	
	public void imprimeDados() {
		System.out.println(getNome());
		System.out.println(getNascimento());
		System.out.println(getCodigo());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
