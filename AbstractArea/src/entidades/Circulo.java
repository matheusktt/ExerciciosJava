package entidades;

import entidades.enums.Cores;

public class Circulo extends Forma {
	
	private Double raio;

	public Circulo() {
		super();
	}

	public Circulo(Cores cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
}
