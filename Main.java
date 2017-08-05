package questão1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Retangulo r1 = new Retangulo();
		
		System.out.println("Digite a largura do retângulo");
		r1.setLargura(leitor.nextFloat());
		
		System.out.println("Digite a altura do retângulo");
		r1.setAltura(leitor.nextFloat());
	
		System.out.println(r1.equals());
		System.out.println(r1);
		
		leitor.close();
	}
}
