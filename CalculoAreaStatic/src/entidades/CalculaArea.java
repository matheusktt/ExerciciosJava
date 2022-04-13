package entidades;

public class CalculaArea {
	
	private static final double pi = Math.PI;

	public static double calculaTriangulo(double A, double C) {
		return A * C / 2.0;
	}
	
	public static double calculaCiruculo(double C) {
		return pi * C * C;
	}
	
	public static double calculaTrapezio(double A, double B, double C) {
		return (A + B) / 2.0 * C;
	}
	
	public static double calculaQuadrado(double B) {
		return B * B;
	}
	
	public static double calculaRetangulo(double A, double B) {
		return A * B;
	}
}
