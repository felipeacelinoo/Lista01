package questão9;

public class Retangulo extends Quadrilateros {
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcArea(double base, double altura) {
		double area = base * altura;
		return area;
	}
	
	public double calcPerimetro(double base, double altura) {
		double perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "A área do retângulo é :" + calcArea(this.base, this.altura) + "\n"
				+ "O perímetro do retângulo é : " + calcPerimetro(this.base, this.altura);
	}
}
