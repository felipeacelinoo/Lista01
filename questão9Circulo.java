package quest�o9;

public class Circulo extends Quadrilateros {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcArea(double pi, double raio) {
		double area = pi * (raio * raio);
		return area;
	}
	

	public double calcPerimetro(double raio) {
		double perimetro = 2 * 3.14 * raio;
		return perimetro;
	}

	public String toString() {
		return "A �rea do circulo � :" + calcArea(3.14, this.raio) + "\n"
				+ "O per�metro do circulo � : " + calcPerimetro(this.raio);
	}
}
