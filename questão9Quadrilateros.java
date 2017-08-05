package questão9;

public abstract class Quadrilateros implements FiguraGeometrica{
	
	/*private float lado1;
	private float lado2;
	private float lado3;
	private float lado4;
	*/
	public abstract double calcArea(double base, double altura);
	
	public double calcPerimetro(double base, double altura) {
		double perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}


	public Quadrilateros() {
		
	}
	
/*	public Quadrilateros(float lado1, float lado2, float lado3, float lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	} */

	/*public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getLado3() {
		return lado3;
	}

	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}

	public float getLado4() {
		return lado4;
	}

	public void setLado4(float lado4) {
		this.lado4 = lado4;
	}
	*/
	
	
}