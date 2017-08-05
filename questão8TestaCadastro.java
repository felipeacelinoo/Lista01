package questão8;

import java.util.Scanner;

public class TestaCadastro {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		CadastroPessoas pessoas = new CadastroPessoas();
		
		for(int i = 0; i<3; i++) {
		
			Cliente c = new Cliente();
			Data d = new Data();
			
			System.out.println("Digite o nome do cliente");
			String nome = leitor.nextLine();
			c.setNome(nome);
			
			System.out.println("Digite o código do cliente");
			String strCod = leitor.nextLine();
			c.setCodigo(Integer.parseInt(strCod));
			
			System.out.println("Digite o dia de nascimento de " + nome);
			String strDia = leitor.nextLine();
			d.setDia(Integer.parseInt(strDia));
			
			System.out.println("Digite o mês de nascimento de " + nome);
			String strMes = leitor.nextLine();
			d.setMes(Integer.parseInt(strMes));
		
			System.out.println("Digite o ano de nascimento de " + nome);
			String strAno = leitor.nextLine();
			d.setAno(Integer.parseInt(strAno));
		
			c.setNascimento(d);
			pessoas.cadastraPessoa(c);
		}
		
		for(int i = 0; i<3; i++) {
			Funcionario f = new Funcionario();
			Data d = new Data();
			
			System.out.println("Digite o nome do cliente");
			String nome = leitor.nextLine();
			f.setNome(nome);
			
			System.out.println("Digite o salário do funcionário");
			String strSal = leitor.nextLine();
			f.setSalario(Float.parseFloat(strSal));
			
			System.out.println("Digite o dia de nascimento de " + nome);
			String strDia = leitor.nextLine();
			d.setDia(Integer.parseInt(strDia));
			
			System.out.println("Digite o mês de nascimento de " + nome);
			String strMes = leitor.nextLine();
			d.setMes(Integer.parseInt(strMes));
		
			System.out.println("Digite o ano de nascimento de " + nome);
			String strAno = leitor.nextLine();
			d.setAno(Integer.parseInt(strAno));
			
			f.setNascimento(d);
			pessoas.cadastraPessoa(f);
		}
		
	
		for(int i = 0; i<3; i++) {
			Gerente g = new Gerente();
			Data d = new Data();
			
			System.out.println("Digite o nome do cliente");
			String nome = leitor.nextLine();
			g.setNome(nome);
			
			System.out.println("Digite o salário do funcionário");
			String strSal = leitor.nextLine();
			g.setSalario(Float.parseFloat(strSal));
			
			System.out.println("Digite o dia de nascimento de " + nome);
			String strDia = leitor.nextLine();
			d.setDia(Integer.parseInt(strDia));
			
			System.out.println("Digite a área do gerente:");
			g.setArea(leitor.nextLine());
			
			System.out.println("Digite o mês de nascimento de " + nome);
			String strMes = leitor.nextLine();
			d.setMes(Integer.parseInt(strMes));
		
			System.out.println("Digite o ano de nascimento de " + nome);
			String strAno = leitor.nextLine();
			d.setAno(Integer.parseInt(strAno));
		
			g.setNascimento(d);
			pessoas.cadastraPessoa(g);
		}
	
        pessoas.imprimeCadastro();
		
		leitor.close();
	}

}
