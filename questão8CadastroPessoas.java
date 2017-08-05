package questão8;

import java.util.List;

public class CadastroPessoas {

	private List <Pessoa> pessoa;
	
	public void cadastraPessoa(Pessoa pess) {
		pessoa.add(pess);
	}

	public List<Pessoa> getPessoa(){
		return this.pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

	public void imprimeCadastro() {
		for(Pessoa p : pessoa) {
			if(p instanceof Funcionario) {
				if(p instanceof Gerente) {
					p.imprimeDados();
				} else {
					p.imprimeDados();
				}
			}
		p.imprimeDados();
		}
	}
	
}
