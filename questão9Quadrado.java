package questão9;

public class Quadrado extends Quadrilateros{

	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcArea(double base, double altura) {
		double area = base * altura;
		return area;
	}
	
	public double calcPerimetro(double lado) {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public String toString() {
		return "A área do quadrado é :" + calcArea(this.lado, this.lado) + "\n"
				+ "O perímetro do quadrado é : " + calcPerimetro(this.lado);
	}
}
