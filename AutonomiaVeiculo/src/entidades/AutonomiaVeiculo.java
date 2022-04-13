package entidades;

public class AutonomiaVeiculo {
	
	private Double tempoViagem;
	private Double velocidadeMedia;
	private Integer kmLitro = 12;
	
	public AutonomiaVeiculo() {

	}

	public AutonomiaVeiculo(double tempoViagem, double velocidadeMedia) {
		this.tempoViagem = tempoViagem;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public double getTempoViagem() {
		return tempoViagem;
	}

	public void setTempoViagem(double tempoViagem) {
		this.tempoViagem = tempoViagem;
	}

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public int getKmLitro() {
		return kmLitro;
	}

	public void setKmLitro(int kmLitro) {
		this.kmLitro = kmLitro;
	}

	public double distanciaPercorrida() {
		return tempoViagem * velocidadeMedia;
	}
	
	public double combustivelUtilizado() {
		return distanciaPercorrida() / kmLitro;
	}
}