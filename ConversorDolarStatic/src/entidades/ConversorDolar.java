package entidades;

public class ConversorDolar {
	
	private static final double IOF = 0.06;
	

	public static double conversor(double dolar, double quantidadeDolar) {
		return dolar * quantidadeDolar * (1.0 + IOF);
	}
}
