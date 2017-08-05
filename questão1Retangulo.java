package questão1;

public class Retangulo {
	
	private float largura;
	private float altura;
	
	public Retangulo() {
		this.largura = 0;
		this.altura = 0;
	}

	public Retangulo(float largura, float altura) {
		largura = this.largura;
		altura = this.altura;
	}

	public String toString() {
		return "A área do retângulo é:" + calcArea(this.largura, this.altura) + "\n" +
		"O perímetro do retântulo é:" + calcPerimetro(this.largura, this.altura);
	} 

	public boolean equals() {
		if (this.largura == this.altura) {
			return true;
		} else {
			return false;
		}
	}

	public float calcPerimetro(float largura, float altura) {
		float perimetro = (largura * 2) + (altura * 2);
		return perimetro;
	}

	public float calcArea(float largura, float altura) {
		float area = largura * altura;
		return area;
	}
	
	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
}
