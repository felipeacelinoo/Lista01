package questão2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa:");
		String nome = leitor.nextLine();
		
		System.out.println("Digite a idade de " + nome);
		String idade = leitor.nextLine();
		
		System.out.println("Digite a altura de " + nome);
		double altura = leitor.nextDouble();
		
		System.out.println("Digite o peso de " + nome);
		double peso = leitor.nextDouble();
		
		System.out.println("Digite o sexo de " + nome);
		String sexo = leitor.nextLine();
		
		Pessoa p = new Pessoa(nome,idade,altura,peso,sexo);
		
		System.out.println(p);
		
		leitor.close();
		
		
		
	}
}
