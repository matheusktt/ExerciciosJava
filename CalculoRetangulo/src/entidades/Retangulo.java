package entidades;

public class Retangulo {
	private Double largura;
	private Double altura;
	
	public Retangulo() {

	}	

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double area() {
		return largura * altura;
	}
	
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double perimetro() {
		return (largura + altura) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(largura * largura + altura *altura);
	}
	
	public String toString () {
		return "A Área do retangulo é " + String.format("%.2f%n", area()) + 
				"O Perímetro é " + String.format("%.2f%n", perimetro()) + 
				"A Diagonal é " + String.format("%.2f", diagonal());	
	}
}