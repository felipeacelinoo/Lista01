package questão9;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
		ArrayList<Quadrado> quadrado = new ArrayList<Quadrado>();
		ArrayList<Retangulo> retangulo = new ArrayList<Retangulo>();
		ArrayList<Circulo> circulo = new ArrayList<Circulo>();
		
		for(int i = 0; i<2; i++) {  //instanciando retângulos
 			System.out.println("Digite a base do retângulo " + (i+1));
 			String sBase = leitor.nextLine();
 			double base = Double.parseDouble(sBase);
 			
 			System.out.println("Digite a altura do retângulo " + (i+1));
 			String sAltura = leitor.nextLine();
 			double altura = Double.parseDouble(sAltura);
 			
 			Retangulo ret = new Retangulo(base, altura);
 			ret.calcArea(ret.getBase(), ret.getAltura());
 			ret.calcPerimetro(ret.getBase(), ret.getAltura());
 			retangulo.add(ret);
		}
		
		for(int i = 0; i<2; i++) {  //instanciando quadrados
 			System.out.println("Digite a base do quadrado " + (i+1));
 			String sBase = leitor.nextLine();
 			double base = Double.parseDouble(sBase);
 			
 			Quadrado quad = new Quadrado(base);
 			quad.calcPerimetro(quad.getLado());
 			quad.calcArea(quad.getLado(), quad.getLado());
 			quadrado.add(quad);
		}
	
		for(int i = 0; i<2; i++) {  //instanciando circulos
 			System.out.println("Digite o raio do circulo " + (i+1));
 			String sRaio = leitor.nextLine();
 			double raio = Double.parseDouble(sRaio);
 			
 			double pi = 3.14;
 			Circulo circ = new Circulo(raio);
 			circ.calcPerimetro(circ.getRaio());
 			circ.calcArea(pi, circ.getRaio());
 			circulo.add(circ);
		}
		
		for(Quadrado q : quadrado) {
		
			System.out.println(q.toString());
		
		}
		
		System.out.println("\n");
		
		for(Retangulo r : retangulo) {
			System.out.println(r.toString());
		}
		
		System.out.println("\n");
		
		for(Circulo c : circulo) {
			System.out.println(c.toString());
		}
		
		leitor.close();
	}
	
}