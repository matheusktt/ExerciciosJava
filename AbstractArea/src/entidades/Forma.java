package entidades;

import entidades.enums.Cores;

public abstract class Forma {
	
	Cores cor;

	public Forma() {
	
	}

	public Forma(Cores cor) {
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

	public void setCor(Cores cor) {
		this.cor = cor;
	}
	
	public abstract double area();
	
}
